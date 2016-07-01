package commonization;

class Student extends Account{

	Lecture[] participations = new Lecture[30];
	int participationsNumber = 0;

	void registLecture(Lecture lecture){
		participations[participationsNumber] = lecture;
		participationsNumber++;
	}



}
