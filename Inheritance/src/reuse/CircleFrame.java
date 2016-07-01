package reuse;

import java.awt.Frame;
import java.awt.Graphics;

class CircleFrame extends Frame{

	@Override
	public void paint(Graphics g){
		g.fillOval(100, 100, 100, 100);
	}
}

