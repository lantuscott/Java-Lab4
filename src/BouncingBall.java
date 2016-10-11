/******************************************************************************
 * Compilation: javac BouncingBall.java Execution: java BouncingBall
 * Dependencies: StdDraw.java
 *
 * Implementation of a 2-d bouncing ball in the box from (-1, -1) to (1, 1).
 *
 * from: http://introcs.cs.princeton.edu/java/home/
 *
 ******************************************************************************/

public class BouncingBall
{
	public static void main(String[] args)
	{
		// set the scale of the coordinate system
		StdDraw.setXscale(-1.0, 1.0);
		StdDraw.setYscale(-1.0, 1.0);
		StdDraw.enableDoubleBuffering();

		// initial values
		double rx = 0.47, ry = 0.47; // initial position
		double vx = 0.001, vy = 0.002; // velocity
		double radius = 0.05; // radius
		double lastrx = rx;
		double lastry = ry;

		// main animation loop
		while (true)
		{
			// bounce off wall according to law of elastic collision
			if (Math.abs(rx + vx) > 1.0 - radius)
				vx = -vx;
			if (Math.abs(ry + vy) > 1.0 - radius)
				vy = -vy;

			// update position
			rx = rx + vx;
			ry = ry + vy;

			// StdDraw.line(lastrx, lastry, rx, ry);
			lastrx = rx;
			lastry = ry;

			// clear the background
			StdDraw.clear(StdDraw.GRAY);

			// draw ball on the screen
			StdDraw.filledCircle(rx, ry, radius);
			StdDraw.circle(rx, ry, radius);
			// copy offscreen buffer to onscreen
			StdDraw.show();

			// pause for 20 ms
			StdDraw.pause(2);
			
	
		}
	}
}