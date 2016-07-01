package lowcondension.view;

import lowcondension.circle.Circle;
import tookit.Monitor;

public class View {

	public void start(){
		Monitor monitor = Monitor.getInstance();
		Circle circle = new Circle(monitor);

		while(!isEnd()){
			circle.update();
			paint(circle);
		}
	}

	private boolean isEnd(){
		return false;
	}

	private void paint(Circle c){

	}
}
