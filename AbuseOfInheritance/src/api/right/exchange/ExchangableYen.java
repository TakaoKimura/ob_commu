package api.right.exchange;

import api.right.yen.Yen;


public class ExchangableYen extends Yen {

	private Rate rate = new Rate();

	public ExchangableYen(int value) {
		super(value);
	}

	public int exchangeDollar(){
		return getValue() * (int)rate.dollar();
	}

}

