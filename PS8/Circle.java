public class Circle extends GeometricObject{
	
	/** Attributes */
	private double radius;
	
	/** Constructors */
	public Circle() {
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}
	
	
	/** Methods */
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/** Return the area of this circle */
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	/** Return the perimeter of this circle */
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	/** Return diameter */
	public double getDiameter() {
		return 2 * radius;
	}

	/** Print the circle info */
	public void printCircle() {
		System.out.println("The circle is created " + getDateCreated() +
				" and the radius is " + radius);
	}

	/** Override the toString method defined in the superclass */
	public String toString() {
		return super.toString() + "\nradius is " + radius;
	}
}