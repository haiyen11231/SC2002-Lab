package part2;

public class Rectangle extends Shape {
	protected double width;
	protected double length;
	
	public Rectangle(double width, double length) {
		super("Reactangle");
		this.width = width;
		this.length = length;
	}
	
	@Override
	public double calArea() {
		return width * length;
	}
}
