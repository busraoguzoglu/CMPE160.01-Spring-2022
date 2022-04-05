class Circle {
	
	
	/** The radius of this circle */
	private double radius;
	private double x = 1;
	private double y = 0;
	
	// Constructors
	/** Construct a circle object */
	Circle() {
		// Calling the other constructor
		this(1, 2, 2);
		//this.radius = 1;
	}
	
	/** Construct a circle object with its radius*/
	Circle(double radius) {
		this.radius = radius;
	}
	
	/** Construct a circle object with its radius*/
	Circle(double radius, double x, double y) {
		this.radius = radius;
		this.x = x;
		this.y = y;
	}
	
	
	// Methods
	/** Return the area of this circle */
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	/** Return the perimeter of this circle */
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	
	
	/** Getters and Setters */
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	
	

	/** String representation of the object */

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", x=" + x + ", y=" + y + "]";
	}
	
	
	
	
}