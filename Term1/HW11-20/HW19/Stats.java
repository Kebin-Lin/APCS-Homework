/*
Kevin Lin, Maryann Foley, Jessica Wu
APCS1 pd8
HW19 -- gcd 3 ways
2017-10-18
*/
public class Stats {

    public static int mean(int a, int b) {
	int c = a + b;
	c /= 2;
	return c;
    }

    public static double mean(double a, double b) {
	double c = a + b;
	c /= 2;
	return c;
    }

    public static int max(int a, int b) {
	if (a >= b) {
	    return a;
	}
	return b;
    }

    public static int max(int a, int b, int c) {
	return max(max(a,b),c);
    }

    public static double max(double a, double b) {
	if (a >= b) {
	    return a;
	}
	return b;
    }

    public static double max(double a, double b, double c) {
	return max(max(a,b),c);
    }

    public static int geoMean(int a, int b) {
	return (int) Math.sqrt(a * b);
    }

    public static int geoMean(int a, int b, int c) {
	return (int) Math.pow(a * b * c, (1.0/3));
    }

    public static double geoMean(double a, double b) {
	return Math.sqrt(a * b);
    }

    public static double geoMean(double a, double b, double c) {
	return Math.pow(a * b * c, (1.0/3));
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

    public static int gcdER(int a, int b) {
        if (a % b == 0) { return b; }
	else if (b % a == 0) { return a; }
	return gcdERHelper(a,b);
    }

    private static int gcdERHelper(int a, int b) {
	if (b > a) {
	    b -= a;
	    if (b == 0) { return a; }
	    else { return gcdERHelper(a,b); }
	}
	else {
	    a -= b;
	    if (a == 0) { return b; }
	    else { return gcdERHelper(a,b); }
	}}

    public static int gcdEW(int a, int b) {
	if (a % b == 0) { return b; }
	else if (b % a == 0) { return a;}
	while (!(b == 0 || a == 0)) {
	    if (a > b) { a -= b; }
	    else { b -= a; }
	}
	if (a == 0) { return b; }
	return a;
    }

    public static void main(String[] args) {
	System.out.println("======= mean(6,10) and mean(6.5,9.5) =======");
	System.out.println(mean(6,10)); //Output 8
	System.out.println(mean(6.5,9.5)); //Output 8.0
	System.out.println("======= max(9,10) and max(1239.23,1231.123) =======");
	System.out.println(max(9,10)); //Output 10
	System.out.println(max(1239.23,1231.123)); //Output 1239.23
	System.out.println("======= geomean(3,27) and geoMean(3.0,27.0) =======");
	System.out.println(geoMean(3,27)); //Output 9
	System.out.println(geoMean(3.0,27.0)); //Output 9
	System.out.println("======= geoMean(-3.0,27.0) =======");
	System.out.println(geoMean(-3.0,27.0)); //Output NaN
	System.out.println("======= geoMean(3,9,27) and geoMean(3.0,9.0,27.0) =======");
	System.out.println(geoMean(3,9,27)); //Output 8
	System.out.println(geoMean(3.0,9.0,27.0)); //Output 8.999999
	System.out.println("======= max(13,2,4) and max(13.0,23.1,132.23) =======");
	System.out.println(max(13,2,4)); //Output 13
	System.out.println(max(13.0,23.1,132.23)); //Output 132.23
	System.out.println("======= gcd(a,b) =======");
	System.out.println(gcd(15,20)); //5
	System.out.println(gcd(10,42)); //2
	System.out.println("======= gcdER(a,b) =======");
	System.out.println(gcdER(15,20)); //5
	System.out.println(gcdER(10,42)); //2
	System.out.println("======= gcdEW(a,b) =======");
	System.out.println(gcdEW(15,20)); //5
	System.out.println(gcdEW(10,42)); //2
    }
}
