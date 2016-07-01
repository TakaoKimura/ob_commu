package highcondension.circle;


public class Circle {

	private int x;
	private int y;

	public Circle(int x, int y){
		this.x = x;
		this.y = y;
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
