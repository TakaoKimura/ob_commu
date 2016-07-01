package api.solution.yen;

public class Yen {

	private int value;
	private Rate rate = new Rate();

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

	public double exchangeDollar(){
		return getValue() * rate.dollar();
	}
}
