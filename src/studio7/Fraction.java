package studio7;

public class Fraction {

	private int numerator;
	private int denominator;
	
	public Fraction() {
		numerator = 0;
		denominator = 0;
	}
	public Fraction(int initNumerator, int initDenominator) {
		numerator = initNumerator;
		denominator = initDenominator;
		
	}
	
	public static Fraction add(Fraction f1, Fraction f2) {
		int gcd = getGCD(f1.denominator, f2.denominator);
		int lcm = f1.denominator*f2.denominator/gcd;
		
		
		Fraction new1 = new Fraction (f1.numerator*lcm/f1.denominator, lcm);
		Fraction new2 = new Fraction (f2.numerator*lcm/f2.denominator, lcm);
		Fraction last = new Fraction(new1.numerator + new2.numerator, lcm);
		return last.simplify();

		
	}
	public static Fraction multiply(Fraction f1, Fraction f2) {
		Fraction last = new Fraction(f1.numerator*f2.numerator, f1.denominator*f2.denominator);
		return last.simplify();
	}
	public static int getGCD(int p, int q) {
		
		if (p % q == 0)
		{
			return q;
		}
		else
		{
			return getGCD(q, (p % q));
		}

		
	}
	public Fraction reciprocal() {
		return new Fraction(denominator, numerator);
	}
	public Fraction simplify() {
		int gcd = getGCD(numerator, denominator);
		return new Fraction(numerator/gcd, denominator/gcd);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1 = new Fraction(1, 3);
		Fraction f2 = new Fraction(2, 3);
		System.out.println(add(f1, f2).numerator + "/" + add(f1, f2).denominator);
		System.out.println(multiply(f1, f2).numerator + "/" + multiply(f1, f2).denominator);
		System.out.println(f1.reciprocal().numerator + "/" + f1.reciprocal().denominator);
	}

}
