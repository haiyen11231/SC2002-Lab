package part2;

public abstract class Shape {
	protected String name;
	
	public Shape(String name) {
		this.name = name;
	}

	public abstract double calArea();
	
	public String getName() {
		return name;
	}
	
	public String toString() {
        return "Shape: " + name + "\nArea: " + calArea();
    }
}
