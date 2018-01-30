/*
Kevin Lin
APCS1 pd8
HW13 -- May ah Hahv S'maur, Please?
2017-10-10
*/
public class StatsDriver {
    
    public static void main(String[] args) {
	System.out.println("======= Stats.mean(6,10) and Stats.mean(6.5,9.5) =======");
	System.out.println(Stats.mean(6,10)); //Output 8
	System.out.println(Stats.mean(6.5,9.5)); //Output 8.0
	System.out.println("======= Stats.max(9,10) and Stats.max(1239.23,1231.123) =======");
	System.out.println(Stats.max(9,10)); //Output 10
	System.out.println(Stats.max(1239.23,1231.123)); //Output 1239.23
	System.out.println("======= Stats.geoMean(3,27) and Stats.geoMean(3.0,27.0) =======");
	System.out.println(Stats.geoMean(3,27)); //Output 9
	System.out.println(Stats.geoMean(3.0,27.0)); //Output 9
	System.out.println("======= Stats.geoMean(-3.0,27.0) =======");
	System.out.println(Stats.geoMean(-3.0,27.0)); //Output NaN
	System.out.println("======= Stats.geoMean(3,9,27) and Stats.geoMean(3.0,9.0,27.0) =======");
	System.out.println(Stats.geoMean(3,9,27)); //Output 8
	System.out.println(Stats.geoMean(3.0,9.0,27.0)); //Output 8.999999
	System.out.println("======= Stats.max(13,2,4) and Stats.max(13.0,23.1,132.23) =======");
	System.out.println(Stats.max(13,2,4)); //Output 13
	System.out.println(Stats.max(13.0,23.1,132.23)); //Output 132.23
    }
}