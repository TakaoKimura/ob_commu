package integer.solution;

public class PrimeNumber {


	private Integer number;

	public PrimeNumber(int number) {
		if(!isPrimeNumber(number)){
			throw new NumberException();
		}
		this.number = new Integer(number);
	}


	public static  boolean isPrimeNumber(int number) {
		for (int divisor = 2; divisor < number; divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}
		return true;
	}

	public byte byteValue(){
		return number.byteValue();
	}

	public String toString(){
		return number.toString();
	}



}


