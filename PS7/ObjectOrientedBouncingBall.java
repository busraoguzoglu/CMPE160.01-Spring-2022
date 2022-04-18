public class ObjectOrientedBouncingBall {

	private static void initializeDrawing() {
		StdDraw.setCanvasSize(400, 400); // set the size of the drawing canvas
		StdDraw.setXscale(-1.0, 1.0); // set the scale of the coordinate system
		StdDraw.setYscale(-1.0, 1.0);
		StdDraw.enableDoubleBuffering(); // Use for faster animations
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		initializeDrawing();
		int pauseDuration = 15; // pause duration in milliseconds
		
		Ball ball = new Ball(0.5, 0.8, 0.15, 0.05, 0.05, StdDraw.BOOK_LIGHT_BLUE, StdDraw.RED);
		Ball ball2 = new Ball(0.4, 0.9, 0.01, 0.05, 0.10, StdDraw.ORANGE, StdDraw.BLACK);

		while (true)  { // main animation loop - infinite loop 

			ball.clearScreen(); // clear the background
			ball2.clearScreen();
			
			ball.draw();
			ball.move();
			
			ball2.draw();
			ball2.move();

			StdDraw.show(); // show the drawing on the screen
			StdDraw.pause(pauseDuration); // pause the drawing at each iteration
		} // while
	}

}
