package shape;

import java.awt.Graphics;
import java.awt.Point;

public class Dot extends Shape {

	public Dot(Point origin){
		super(origin);
	}

	@Override
	public void draw(Graphics g) {
		g.fillOval(origin.x, origin.y, 4, 4);
	}

}
