package section17_map_exercise.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter full file path: ");
		String path = sc.nextLine();
		
		// LinkedHashMap keeps the order of insertion for a cleaner output
		Map<String, Integer> votes = new LinkedHashMap<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while (line != null) {
				
				String[] fields = line.split(",");
				String name = fields[0].trim();
				int count = Integer.parseInt(fields[1].trim());
				
				if (votes.containsKey(name)) {
					// If the candidate is already in the map, add current votes to previous total
					int votesSoFar = votes.get(name);	
					votes.put(name, count + votesSoFar);
				} else {
					// If it's the first time the candidate appears
					votes.put(name, count);
				}
				
				line = br.readLine();
			}
			
			System.out.println("\nELECTION RESULT:");
			for (String key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}
