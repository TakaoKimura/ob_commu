package commonization;

abstract class Account {

	int number;
	String name;

	boolean isNumberedBy(int number){
		return this.number == number;
	}

	boolean isNamed(String name){
		return this.name.equals(name);
	}



}
