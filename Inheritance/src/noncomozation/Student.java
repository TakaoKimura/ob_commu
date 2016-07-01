package noncomozation;

class Student {

	int number;
	String name;
	Lecture[] participations = new Lecture[30];
	int participationsNumber = 0;

	boolean isNumberedBy(int number){
		return this.number == number;
	}

	boolean isNamed(String name){
		return this.name.equals(name);
	}

	void registLecture(Lecture lecture){
		participations[participationsNumber] = lecture;
		participationsNumber++;
	}



}
