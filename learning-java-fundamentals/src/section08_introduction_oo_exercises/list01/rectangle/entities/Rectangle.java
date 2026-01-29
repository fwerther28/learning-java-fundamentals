package section08_introduction_oo_exercises.list01.rectangle.entities;

public class Rectangle {
	
	public double width;
	public double height;
	
	// Method to calculate area
	public double area() {
		return width * height;
	}
	
	// Method to calculate perimeter 
	public double perimeter() {
		return 2 * (width * height);
	}
	
	// Method to calculate diagonal using Pythagoras
	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
}
