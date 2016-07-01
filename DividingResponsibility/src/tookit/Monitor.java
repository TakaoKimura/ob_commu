package tookit;

public class Monitor {

	private int width;
	private int height;

	private Monitor(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public static Monitor getInstance(){
		return new Monitor(1200, 1200); //てきとー
	}

	public int getWidth(){
		return width;
	}

	public int getHeight(){
		return height;
	}
}
