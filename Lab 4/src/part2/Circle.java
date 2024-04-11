package part2;
import java.lang.Math;

public class Circle extends Shape {
	protected double radius;

	public Circle(double radius) {
		super("Circle");
		this.radius = radius;
	}
	
	@Override
	public double calArea() {
		return Math.PI * radius * radius;
	}
}
