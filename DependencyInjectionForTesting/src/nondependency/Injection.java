package nondependency;

public class Injection {

	public static void main(String args){

		Schedule schedule = new Schedule("2014/02/29/00/00/00", "LeapYear", new LeapYearTimeManager());

	}
}

