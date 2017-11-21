/*
Kevin Lin
APCS1 pd8
HW36 -- Be Rational
2017-11-20
*/
public class Rational {
    private int numerator;
    private int denominator;
    
    public Rational() { //Default
	numerator = 0;
	denominator = 1;
    }
    
    public Rational(int p, int q) {
	this();
	if (q == 0) {
		System.out.println("Invalid Rational");
	}
	else {
	    numerator = p;
	    denominator = q;
	}
    }

    public String toString() {
	return numerator + "/" + denominator;
    }

    public double floatValue() {
	return numerator / (double) denominator;
    }

    public void multiply(Rational other) {
	numerator *= other.numerator;
	denominator *= other.denominator;
    }

    public void divide(Rational other) {
	//Division is the same as multiplying by the inverse
	if (other.numerator == 0) {
	    System.out.println("Cannot divide by zero");
	    return;
	}
	numerator *= other.denominator;
	denominator *= other.numerator;
    }

    public static void main(String[] args) {
	System.out.println("======= Rational first = new Rational() =======");
	Rational first = new Rational();
	System.out.println(first); // 0/1
	System.out.println("======= Rational second = new Rational(1,3) =======");
	Rational second = new Rational(1,3);
	System.out.println(second); // 1/3
	System.out.println("======= Rational third = new Rational(1337,0) =======");
	Rational third = new Rational(1337,0);
	System.out.println(third); // 0/1
	System.out.println("======= second.multiply(first) =======");
	second.multiply(first);
	System.out.println(second); // 0/3 
	System.out.println("======= second.divide(first) =======");
	third.divide(first); // Cannot divide by zero
	System.out.println(second); // 0/3
	System.out.println("======= Rational fourth = new Rational(2,7) =======");
	Rational fourth = new Rational(2,7);
	System.out.println(fourth);
	System.out.println("======= fourth.floatValue() =======");
	System.out.println(fourth.floatValue());
    }
}
