package paint;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

public class PaintCanvas extends Canvas implements MouseListener {

	private int mode = 0;
	private Point pressed;

	private List<Integer> modes = new ArrayList<Integer>();
	private List<Point> points = new ArrayList<Point>();

	public PaintCanvas() {
		addMouseListener(this);
	}

	void changeModeFor(int mode) {
		this.mode = mode;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		pressed = e.getPoint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (mode == 0) {
			getGraphics().fillOval(pressed.x - 2, pressed.y - 2, 4, 4);
			points.add(pressed);
			modes.add(mode);
		} else if (mode == 1) {
			Point released = e.getPoint();
			getGraphics()
					.drawLine(pressed.x, pressed.y, released.x, released.y);
			points.add(pressed);
			points.add(released);
			modes.add(mode);
		} else if (mode == 2) {
			Point released = e.getPoint();
			int radius = (int) (Math.sqrt(Math.pow(pressed.x - released.x, 2)
					+ Math.pow(pressed.y - released.y, 2)));
			getGraphics().fillOval(pressed.x - radius, pressed.y - radius,
					radius * 2, radius * 2);
			points.add(pressed);
			points.add(released);
			modes.add(mode);
		} else if (mode == 3) {
			Point released = e.getPoint();
			int minx = Math.min(pressed.x, released.x);
			int miny = Math.min(pressed.y, released.y);
			int width = Math.abs(pressed.x - released.x);
			int height = Math.abs(pressed.y - released.y);
			getGraphics().drawRect(minx, miny, width, height);
			points.add(pressed);
			points.add(released);
			modes.add(mode);
		}
	}

	@Override
	public void paint(Graphics g) {
		int pointsIndex = 0;
		for (int modesIndex = 0; modesIndex < modes.size(); modesIndex++) {
			if (modes.get(modesIndex) == 0) {
				Point p = points.get(pointsIndex);
				getGraphics().fillOval(p.x - 2, p.y - 2, 4, 4);
				pointsIndex += 1;
			} else if (modes.get(modesIndex) == 1) {
				Point p1 = points.get(pointsIndex);
				Point p2 = points.get(pointsIndex + 1);
				getGraphics().drawLine(p1.x, p1.y, p2.x, p2.y);
				pointsIndex += 2;
			} else if (modes.get(modesIndex) == 2) {
				Point p1 = points.get(pointsIndex);
				Point p2 = points.get(pointsIndex + 1);
				int radius = (int) (Math.sqrt(Math.pow(p1.x - p2.x, 2)
						+ Math.pow(p1.y - p2.y, 2)));
				getGraphics().fillOval(p1.x - radius, p1.y - radius,
						radius * 2, radius * 2);
				pointsIndex += 2;
			} else if (modes.get(modesIndex) == 3) {
				Point p1 = points.get(pointsIndex);
				Point p2 = points.get(pointsIndex + 1);
				int minx = Math.min(p1.x, p2.x);
				int miny = Math.min(p1.y, p2.y);
				int width = Math.abs(p1.x - p2.x);
				int height = Math.abs(p1.y - p2.y);
				getGraphics().drawRect(minx, miny, width, height);
				pointsIndex += 2;
			}
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
