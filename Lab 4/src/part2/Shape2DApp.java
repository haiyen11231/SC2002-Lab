package part2;
import java.util.Scanner;

public class Shape2DApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double totalArea = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of shapes: ");
		int numOfShapes = sc.nextInt();
		Shape[] shapes = new Shape[numOfShapes];
		
		for (int i = 0; i < numOfShapes; i++) {
			System.out.println("Some basic shapes: ");
			System.out.println("1. Square");
			System.out.println("2. Rectangle");
			System.out.println("3. Circle");
			System.out.println("4. Triangle");
			System.out.println("Enter a shape: ");
			int choice = sc.nextInt();
			switch(choice) {
				case 1: 
					System.out.println("Enter the side of the square: ");
					double side = sc.nextDouble();
					shapes[i] = new Square(side);
					break;
				case 2:
					System.out.println("Enter the width of the rectangle: ");
					double width = sc.nextDouble();
					System.out.println("Enter the length of the rectangle: ");
					double length = sc.nextDouble();
					shapes[i] = new Rectangle(width, length);
					break;
				case 3:
					System.out.println("Enter the radius of the circle: ");
					double radius = sc.nextDouble();
					shapes[i] = new Circle(radius);
					break;
				case 4:
					System.out.println("Enter the base of the triangle: ");
					double base = sc.nextDouble();
					System.out.println("Enter the height of the triangle: ");
					double height = sc.nextDouble();
					shapes[i] = new Triangle(base, height);
					break;
				default:
					System.out.println("Invalid shape!!!");
			}
		}
		
		System.out.println("Type of calculation: ");
		System.out.println("1. Calculate Area");
		System.out.println("Choose the type of calculation: ");
		int choice = sc.nextInt();
		switch(choice) {
			case 1:
				for (Shape shape : shapes) {
					totalArea += shape.calArea();
				}
				System.out.println("The total area of the 2-D figure: " + totalArea);
				break;
			default:
				System.out.println("Invalid type of calculation!!!");
		}
	}

}
