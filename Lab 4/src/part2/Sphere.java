package part2;
import java.lang.Math;

public class Sphere extends Shape {
	private double radius;
	
	public Sphere (double radius) {
		super("Sphere");
		this.radius = radius;
	}
	
	public double calVolume() {
		return 4*(Math.PI * radius * radius * radius)/3;
	}
	
	@Override
	public double calArea() {
		return 4 * Math.PI * radius * radius;
	}
}
