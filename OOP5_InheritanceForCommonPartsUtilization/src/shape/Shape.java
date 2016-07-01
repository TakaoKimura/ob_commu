package shape;

import java.awt.Graphics;
import java.awt.Point;

public abstract class Shape {

	protected Point origin;

	public Shape(Point origin){
		this.origin = origin;
	}

	public abstract void draw(Graphics g);
}


