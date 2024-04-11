package part2;
import java.lang.Math;

public class Cone extends Circle {
	private double height;
	
	public Cone(double radius, double height) {
		super(radius);
		this.name = "Cone";
		this.height = height;
	}
	
	public double calVolume() {
		return (super.calArea() * height)/3;
	}

	@Override
	public double calArea() {
		double baseArea = super.calArea();
		double lateralSurfaceArea = Math.PI * radius * Math.sqrt(height*height + radius*radius);
		return baseArea + lateralSurfaceArea;
	}
}
