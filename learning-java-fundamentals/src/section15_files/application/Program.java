package section15_files.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import section15_files.entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String sourceFileStr = "C:\\Users\\wsiri\\OneDrive\\Área de Trabalho\\learning-java-fundamentals\\in.csv";
	
		List<Product> list = new ArrayList<>();	
		
		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
		// Create 'out' subdirectory
		boolean success = new File(sourceFolderStr + "\\out").mkdir();
		
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";
		
		// Reading the source file
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
			
			String itemCsv = br.readLine();
			while (itemCsv != null) {
				
				String[] fields = itemCsv.split(",");
				String name = fields[0].trim();
				double price = Double.parseDouble(fields[1].trim());
				int quantity = Integer.parseInt(fields[2].trim());
				
				list.add(new Product(name, price, quantity));
				
				itemCsv = br.readLine();
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
				for (Product item : list) {
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}
				System.out.println("SUCCESS! Sumary created.");
			}
		} catch (IOException e ) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
