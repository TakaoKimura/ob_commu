package dirty;

public class Money {

	private int amount;

	public Money(int amount) {
		this.amount = amount;
	}

	public void  times(int multipler){
		amount  *= multipler;
	}

	public int amount(){
		return amount;
	}


}
