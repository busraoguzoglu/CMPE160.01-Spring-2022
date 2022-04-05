public class Rectangle {
	
	// Attributes
	private double width = 1;
	private double height = 0.5;
	private int x = 2;
	private int y = 5;
	
	
	//Constructors
	public Rectangle(double width, double height, int x, int y) {
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}
	public Rectangle() {
	}
	
	public Rectangle(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//Methods
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
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", x=" + x + ", y=" + y + "]";
	}
	
	public void translate(int x, int y) {	
		this.x += x;
		this.y += y;
	}
	
	public double getArea() {	
		return width*height;
	}
	
	
}
