package api.right.yen;

public class Yen {

	private int value;

	public Yen(int value){
		this.value = value;
	}

	public int getValue(){
		return value;
	}

	public int sum(Yen[] yens){
		int sum = value;
		for(Yen yen : yens){
			sum += yen.value;
		}
		return sum;
	}
}


