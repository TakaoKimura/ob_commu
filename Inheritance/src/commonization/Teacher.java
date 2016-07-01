package commonization;

class Teacher extends Account{

	Student[] students = new Student[50];
	int studentsNumber = 0;

	StudentList createListOfName(){
		StudentList list = new StudentList();
		for(int i=0; i < studentsNumber; i++){
			list.describe(students[i]);
		}
		return list;
	}


}
