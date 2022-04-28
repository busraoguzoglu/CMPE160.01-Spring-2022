public class Rectangle extends GeometricObject{
	
	

	/** Attributes */
	private double width = 1;
	private double height = 0.5;
	
	/** Constructors */
	public Rectangle() {
	}
	
	public Rectangle(double width, double height, String color, boolean filled) {
		this.width = width;
		this.height = height;
		
		setColor(color);
		setFilled(filled);
	}

	/** Methods */
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {	
		return width*height;
	}
	
	public double getPerimeter() {	
		return 2* (width+height);
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	
}
