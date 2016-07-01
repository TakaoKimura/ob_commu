package integer.error;

public class PrimeNumber extends Integer{


	public PrimeNumber(int number) {
		super(number);
		if(isPrimeNumber(number)){
			throw new NumberException();
		}
	}


	public static  boolean isPrimeNumber(int number) {
		for (int divisor = 2; divisor < number; divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}
		return true;
	}
}


