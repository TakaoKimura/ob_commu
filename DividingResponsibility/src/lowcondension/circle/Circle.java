package lowcondension.circle;

import tookit.Monitor;

public class Circle {

	private int x;
	private int y;

	public Circle(Monitor monitor){
		x = monitor.getWidth()/2;
		y = monitor.getHeight();
	}

	public void update(){
		y--;
	}

	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}
}
