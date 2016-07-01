package shape;

import java.awt.Graphics;
import java.awt.Point;

public class Dot implements Shape {

	private Point center;

	public Dot(Point center) {
		this.center = center;
	}

	@Override
	public void draw(Graphics g) {
		g.fillOval(center.x - 2, center.y - 2, 4, 4);
	}

}
