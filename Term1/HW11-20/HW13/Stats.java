/*
Kevin Lin
APCS1 pd8
HW13 -- May ah Hahv S'maur, Please?
2017-10-10
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
    }
}
