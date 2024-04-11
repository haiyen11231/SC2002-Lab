package part2;

public class Cubiod extends Rectangle {
	private double height;
	
	public Cubiod(double length, double width, double height) {
		super(width, length);
		this.name = "Cubiod";
		this.height = height;
	}
	
	public double calVolume() {
		return super.calArea() * height;
	}
	
	@Override
	public double calArea() {
		Rectangle r1 = new Rectangle (length, width);
		Rectangle r2 = new Rectangle (width, height);
		Rectangle r3 = new Rectangle (length, height);
		double frontArea = r1.calArea();
		double sideArea = r2.calArea();
		double topArea = r3.calArea();
		return 2 * (frontArea + sideArea + topArea);
	}
	
	
}
