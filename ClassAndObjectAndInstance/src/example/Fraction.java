package example;

class Fraction {

	int numerator;
	int denominator;

	Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	double toDouble() {
		return numerator / denominator;
	}

	Fraction multiply(Fraction multiplier) {
		int nume = numerator * multiplier.numerator;
		int deno = denominator * multiplier.denominator;
		return new Fraction(nume, deno);
	}
}

