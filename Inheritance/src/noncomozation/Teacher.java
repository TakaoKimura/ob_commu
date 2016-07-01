package noncomozation;

class Teacher {

	int number;
	String name;
	Student[] students = new Student[50];
	int studentsNumber = 0;

	boolean isNumberedBy(int number){
		return this.number == number;
	}

	boolean isNamed(String name){
		return this.name.equals(name);
	}

	StudentList createListOfName(){
		StudentList list = new StudentList();
		for(int i=0; i < studentsNumber; i++){
			list.describe(students[i]);
		}
		return list;
	}


}
