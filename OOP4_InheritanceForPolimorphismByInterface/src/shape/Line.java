package shape;

import java.awt.Graphics;
import java.awt.Point;

public class Line implements Shape {

	private Point start;
	private Point end;

	public Line(Point start, Point end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public void draw(Graphics g) {
		g.drawLine(start.x, start.y, end.x, end.y);
	}

}


