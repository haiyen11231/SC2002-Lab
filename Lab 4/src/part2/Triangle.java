package part2;

public class Triangle extends Shape {
	private double base;
	private double height;

	public Triangle(double base, double height) {
		super("Triangle");
		this.base = base;
		this.height = height;
	}

	@Override
	public double calArea() {
		return (base * height)/2;
	}
}
