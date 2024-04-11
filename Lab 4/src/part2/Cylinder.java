package part2;
import java.lang.Math;

public class Cylinder extends Circle {
	private double height;
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.name = "Cylinder";
		this.height = height;
	}
	
	public double calVolume() {
		return super.calArea() * height;
	}
	
	@Override
	public double calArea() {
		double baseArea = 2 * super.calArea();
		Rectangle curvedSurface = new Rectangle(2 * Math.PI * radius, height);
		double curvedSurfaceArea = curvedSurface.calArea();
		return baseArea + curvedSurfaceArea;
	}
}
