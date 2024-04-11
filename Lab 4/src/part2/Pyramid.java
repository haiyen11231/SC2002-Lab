package part2;
import java.lang.Math;

public class Pyramid extends Shape {
	private double base;
	private double height;
	
	public Pyramid(double base, double height) {
		super("Pyramid");
		this.base = base;
		this.height = height;
	}

	public double calVolume() {
		return (base * base * height)/3;
	}
	
	@Override
	public double calArea() {
		double slantHeight = Math.sqrt(height*height + (base/2)*(base/2));
		Triangle triangle = new Triangle(base, slantHeight);
		Square square = new Square(base);
		double baseArea = square.calArea();
		double lateralSurfaceArea = 4 * triangle.calArea();
		return baseArea + lateralSurfaceArea;
	}
}
