package reuse;

import java.awt.Frame;

class Main {

	public static void main(String[] args){

		Frame frame = new Frame();
		frame.setBounds(50, 50, 300, 300);
		frame.setVisible(true);

		CircleFrame circleFrame = new CircleFrame();
		circleFrame.setBounds(350, 50, 300, 300);
		circleFrame.setVisible(true);

	}


}
