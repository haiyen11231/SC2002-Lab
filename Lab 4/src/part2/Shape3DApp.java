package part2;

import java.util.Scanner;

public class Shape3DApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double totalSurfaceArea = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of shapes: ");
		int numOfShapes = sc.nextInt();
		Shape[] shapes = new Shape[numOfShapes];
		
		for (int i = 0; i < numOfShapes; i++) {
			System.out.println("Some basic shapes: ");
			System.out.println("1. Sphere");
			System.out.println("2. Pyramid");
			System.out.println("3. Cubiod");
			System.out.println("4. Cone");
			System.out.println("5. Cylinder");
			System.out.println("Enter a shape: ");
			int choice = sc.nextInt();
			switch(choice) {
				case 1: 
					System.out.println("Enter the radius of the sphere: ");
					double radius = sc.nextDouble();
					shapes[i] = new Sphere(radius);
					break;
				case 2:
					System.out.println("Enter the base of the pyramid: ");
					double base = sc.nextDouble();
					System.out.println("Enter the height of the pyramid: ");
					double height = sc.nextDouble();
					shapes[i] = new Pyramid(base, height);
					break;
				case 3:
					System.out.println("Enter the length of the cubiod: ");
					double length = sc.nextDouble();
					System.out.println("Enter the width of the cubiod: ");
					double width = sc.nextDouble();
					System.out.println("Enter the height of the cubiod: ");
					height = sc.nextDouble();
					shapes[i] = new Cubiod(length, width, height);
					break;
				case 4:
					System.out.println("Enter the radius of the cone: ");
					radius = sc.nextDouble();
					System.out.println("Enter the height of the cone: ");
					height = sc.nextDouble();
					shapes[i] = new Cone(radius, height);
					break;
				case 5:
					System.out.println("Enter the radius of the cylinder: ");
					radius = sc.nextDouble();
					System.out.println("Enter the height of the cylinder: ");
					height = sc.nextDouble();
					shapes[i] = new Cylinder(radius, height);
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
					totalSurfaceArea += shape.calArea();
				}
				System.out.println("The total surface area of the 3-D figure: " + totalSurfaceArea);
				break;
			default:
				System.out.println("Invalid type of calculation!!!");
		}
	}

}
