import java.awt.Color;

public class Ball {

	/*Variables*/
	double position_x;
	double position_y;  // initial (x,y) ball position
	double velocity_x;
	double velocity_y;  // initial velocity components
	double radius;  // radius of the ball
	Color color;
	Color screenColor;

	/*Constructors*/
	public Ball(double position_x, double position_y, double velocity_x, double velocity_y, double radius,
			Color color, Color color2) {

		this.position_x = position_x;
		this.position_y = position_y;
		this.velocity_x = velocity_x;
		this.velocity_y = velocity_y;
		this.radius = radius;
		this.color = color;
		this.screenColor = color2;
	}

	/*Methods*/
	public void draw() {
		StdDraw.setPenColor(color); 
		StdDraw.filledCircle(position_x, position_y, radius);		
	}

	public void move() {
		// bounce off wall according to law of elastic collision
		if (Math.abs(position_x + velocity_x) > 1.0 - radius) 
			velocity_x = -velocity_x;
		if (Math.abs(position_y + velocity_y) > 1.0 - radius) 
			velocity_y = -velocity_y;

		position_x = position_x + velocity_x; // update positions
		position_y = position_y + velocity_y; 

	}
	
	public void clearScreen() {
		StdDraw.clear(screenColor);
	}
}
