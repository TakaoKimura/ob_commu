package api.solution.exchange;

import api.solution.yen.Yen;


public class ExchangableYen{

	private Rate rate = new Rate();
	private Yen yen;

	public ExchangableYen(int value) {
		yen = new Yen(value);
	}

	public int getValue(){
		return yen.getValue();
	}

	public int sum(Yen[] yens){
		return yen.sum(yens);
	}

	public int exchangeDollar(){
		return yen.getValue() * (int)rate.dollar();
	}

}
