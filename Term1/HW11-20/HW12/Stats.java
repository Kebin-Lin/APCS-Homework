/*
Kevin Lin
APCS1 pd8
HW12 -- stAtistically sPeaking
2017-10-5
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
    public static double max(double a, double b) {
	if (a >= b) {
	    return a;
	}
	return b;
    }
    public static int geoMean(int a, int b) {
	int c = (a * b);
	return (int) Math.sqrt(c);
    }
    public static double geoMean(double a, double b) {
	double c = (a * b);
	return Math.sqrt(c);
    }
    public static void main(String[] args) {
	System.out.println(mean(6,10)); //Output 8?
	System.out.println(mean(6.5,9.5)); //Output 8.0?
	System.out.println(max(9,10)); //Output 10?
	System.out.println(max(1239.23,1231.123)); //Output 1239.23?
	System.out.println(geoMean(3,27)); //Output 9?
	System.out.println(geoMean(3.0,27.0)); //Output 9?
    }
}
