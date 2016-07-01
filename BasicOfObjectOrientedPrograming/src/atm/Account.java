package atm;

public class Account {

	int id;
	long balance;

	boolean hasIdOf(int num){
		return id == num;
	}

	void withdraw(long amount){
		balance -= amount;
	}

	void deposit(long amount){
		balance += amount;
	}
}
