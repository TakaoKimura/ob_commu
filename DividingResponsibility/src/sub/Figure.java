package sub;

class Figure {

	int shape;

	int radius;

	Figure(int radius) {
		this.radius = radius;
		shape = 0;
	}

	int width;
	int height;

	Figure(int width, int height) {
		this.width = width;
		this.height = height;
		shape = 1;
	}

	double area(){
		if(shape == 0){
			return radius*radius*3.14;
		}else{
			return width * height;
		}
	}
}



