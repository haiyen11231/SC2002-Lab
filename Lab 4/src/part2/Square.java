package part2;

public class Square extends Shape {
	private double side;

	public Square(double side) {
		super("Square");
		this.side = side;
	}
	
	@Override
	public double calArea() {
		return side * side;
	}
}
