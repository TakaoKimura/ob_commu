package paint;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

class PaintFrame extends JFrame implements ActionListener {

	private PaintCanvas paintCanvas;
	private Button[] buttons = new Button[4];

	PaintFrame() {
		setUpPaintCanvas();
		setUpButtonPanel();
		setUpStateAsInterface();
	}

	private void setUpStateAsInterface() {
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void setUpPaintCanvas() {
		paintCanvas = new PaintCanvas();
		getContentPane().add(paintCanvas, BorderLayout.CENTER);
	}

	private void setUpButtonPanel() {
		initializeButtons();
		getContentPane().add(generateButtonPanel(), BorderLayout.SOUTH);
	}

	private void initializeButtons() {
		this.buttons[0] = generateObservedButton("dot");
		this.buttons[1] = generateObservedButton("line");
		this.buttons[2] = generateObservedButton("circle");
		this.buttons[3] = generateObservedButton("rectangle");
	}

	private JPanel generateButtonPanel() {
		JPanel panel = new JPanel();
		for (Button button : buttons) {
			panel.add(button);
		}
		return panel;
	}

	private Button generateObservedButton(String name) {
		Button button = new Button(name);
		button.addActionListener(this);
		return button;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		changeModeOfPaintCanvas(e.getSource());
	}

	private void changeModeOfPaintCanvas(Object selectedButton) {
		if (selectedButton == buttons[0]) {
			paintCanvas.becomeDotMode();
		} else if (selectedButton == buttons[1]) {
			paintCanvas.becomeLineMode();
		} else if (selectedButton == buttons[2]) {
			paintCanvas.becomeCircleMode();
		} else if (selectedButton == buttons[3]) {
			paintCanvas.becomeRectangleMode();
		}
	}

}
