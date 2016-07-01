package shape;

import java.awt.Graphics;
import java.awt.Point;

public class Circle extends Shape {

	private int diameter;

	public Circle(Point origin, int diameter) {
		super(origin);
		this.diameter = diameter;
	}


	@Override
	public void draw(Graphics g) {
			g.fillOval(origin.x, origin.y, diameter, diameter);
	}
	
}
