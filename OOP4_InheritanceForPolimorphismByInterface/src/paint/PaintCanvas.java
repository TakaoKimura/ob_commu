package paint;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import shape.Circle;
import shape.Dot;
import shape.Line;
import shape.Rectangle;
import shape.Shape;

public class PaintCanvas extends Canvas implements MouseListener {

	private static enum Mode {
		DOT, LINE, CIRCLE, RECTANGLE
	}

	private Mode mode = Mode.DOT;
	private Point pressed;

	private List<Shape> shapes = new ArrayList<Shape>();

	public PaintCanvas() {
		addMouseListener(this);
	}

	void becomeDotMode() {
		mode = Mode.DOT;
	}

	void becomeLineMode() {
		mode = Mode.LINE;
	}

	void becomeCircleMode() {
		mode = Mode.CIRCLE;
	}

	void becomeRectangleMode() {
		mode = Mode.RECTANGLE;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		pressed = e.getPoint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		Shape shape = null;

		if (mode == Mode.DOT) {
			shape = new Dot(pressed);
		} else if (mode == Mode.LINE) {
			shape = new Line(pressed, e.getPoint());
		} else if (mode == Mode.CIRCLE) {
			shape = new Circle(pressed, e.getPoint());
		} else if (mode == Mode.RECTANGLE) {
			shape = new Rectangle(pressed, e.getPoint());
		}
		shapes.add(shape);
		shape.draw(getGraphics());

	}

	@Override
	public void paint(Graphics g) {
		for (Shape shape : shapes) {
			shape.draw(getGraphics());
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}
}
