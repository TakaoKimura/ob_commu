package shape;

import java.awt.Graphics;
import java.awt.Point;

public class Circle implements Shape {

	private Point center;
	private Point onCircumference;

	public Circle(Point center, Point onCircumference) {
		this.center = center;
		this.onCircumference = onCircumference;
	}

	@Override
	public void draw(Graphics g) {
		int radius = (int) (Math.sqrt(Math.pow(center.x - onCircumference.x, 2)
				+ Math.pow(center.y - onCircumference.y, 2)));
		g.fillOval(center.x - radius, center.y - radius, radius * 2, radius * 2);
	}

}



