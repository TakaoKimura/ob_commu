package factory;

import java.awt.Point;

import shape.Circle;
import shape.Dot;
import shape.Line;
import shape.Rectangle;
import shape.Shape;

public class ShapeFactory {

	public Shape createDot(Point center){
		return new Dot(center);
	}

	public Shape createLine(Point start, Point end){
		int distanceX = end.x - start.x;
		int distanceY = end.y - start.y;
		return new Line(start, distanceX, distanceY);

	}

	public Shape createCircle(Point center, Point onCircumference){
		int radius = (int) (Math.sqrt(Math.pow(center.x - onCircumference.x, 2)
				+ Math.pow(center.y - onCircumference.y, 2)));
		Point origin = new Point (center.x-radius, center.y -radius);
		return new Circle(origin, radius * 2);
	}

	public Shape createRectangle(Point diagonal1, Point diagonal2){
		int minx = Math.min(diagonal1.x, diagonal2.x);
		int miny = Math.min(diagonal1.y, diagonal2.y);
		int width = Math.abs(diagonal1.x - diagonal2.x);
		int height = Math.abs(diagonal1.y - diagonal2.y);
		return new Rectangle(new Point(minx, miny), width, height);
	}
}

