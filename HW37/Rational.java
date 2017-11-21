/*
Kevin Lin
APCS1 pd8
HW37 -- Be More Rational
2017-11-21
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

    public static int gcd(int a, int b) {
	int min = a;
	if (a > b) { min = b; }
	int ctr = 1;
	int currentGCD = 1;
	while (ctr <= min) {
	    if (a % ctr == 0 && b % ctr == 0) { currentGCD = ctr; }
	    ctr += 1;
	}
	return currentGCD;
    }

    public void add(Rational other) {
	numerator *= other.denominator;
	numerator += other.numerator * denominator;
  denominator *= other.denominator;
    }

    public void subtract(Rational other) {
	numerator *= other.denominator;
	numerator -= other.numerator * denominator;
  denominator *= other.denominator;
    }

    public int gcd() {
	return gcd(numerator,denominator);
    }

    public void reduce() {
	int gcd = gcd();
	numerator /= gcd;
	denominator /= gcd;
    }

    public int compareTo(Rational other) {
	double thisFloat = floatValue();
	double otherFloat = other.floatValue();
	if (thisFloat == otherFloat) {return 0;}
	else if (thisFloat > otherFloat) {return 1;}
	else return -1;
    }

    public static void main(String[] args) {
	/* HW36 =============================
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
	======================*/

	Rational first = new Rational(1,4);
	Rational second = new Rational(1,2);
	second.add(first);
	System.out.println("======= 1/2 + 1/4 =======");
	System.out.println(second);
  System.out.println("======= 6/8 - 1/4 =======");
  second.subtract(first);
  System.out.println(second);
  System.out.println("======= Reduce 16/32 =======");
  second.reduce();
  System.out.println(second);
  System.out.println("======= 1/2.compareTo(1/4) =======");
  System.out.println(second.compareTo(first));
  System.out.println("======= 1/4.compareTo(1/2) =======");
  System.out.println(first.compareTo(second));
  Rational third = new Rational(22,44);
  System.out.println("======= 1/2.compareTo(22/44) =======");
  System.out.println(second.compareTo(third));
    }
}
