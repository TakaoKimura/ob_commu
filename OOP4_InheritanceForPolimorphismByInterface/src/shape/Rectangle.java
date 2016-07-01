package shape;

import java.awt.Graphics;
import java.awt.Point;

public class Rectangle implements Shape {

	private Point diagonal1;
	private Point diagonal2;

	public Rectangle(Point diagonal1, Point diagonal2) {
		this.diagonal1 = diagonal1;
		this.diagonal2 = diagonal2;
	}

	@Override
	public void draw(Graphics g) {
		int minx = Math.min(diagonal1.x, diagonal2.x);
		int miny = Math.min(diagonal1.y, diagonal2.y);
		int width = Math.abs(diagonal1.x - diagonal2.x);
		int height = Math.abs(diagonal1.y - diagonal2.y);
		g.drawRect(minx, miny, width, height);
	}

}


