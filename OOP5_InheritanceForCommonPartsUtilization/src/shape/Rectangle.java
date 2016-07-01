package shape;

import java.awt.Graphics;
import java.awt.Point;

public class Rectangle extends Shape {

	private int width;
	private int height;

	public Rectangle(Point origin, int width, int height) {
		super(origin);
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw(Graphics g) {
		g.drawRect(origin.x, origin.y, width, height);
	}

}


