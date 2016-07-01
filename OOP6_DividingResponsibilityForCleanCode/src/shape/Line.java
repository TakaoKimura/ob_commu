package shape;

import java.awt.Graphics;
import java.awt.Point;

public class Line extends Shape {

	private int distanceX;
	private int distanceY;

	public Line(Point origin, int distanceX, int distanceY) {
		super(origin);
		this.distanceX = distanceX;
		this.distanceY = distanceY;
	}

	@Override
	public void draw(Graphics g) {
		g.drawLine(origin.x, origin.y, origin.x + distanceX, origin.y+distanceY);
	}

}
