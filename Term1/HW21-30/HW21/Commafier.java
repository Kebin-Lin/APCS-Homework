/*
Kevin Lin
APCS1 pd8
HW21 -- Karmacomma
2017-10-23
*/
public class Commafier {
    public static String commafyR(int n) {
	return commafyRH(Integer.toString(n));
    }//End commafyR
    private static String commafyRH(String n) {
	if (n.length() <= 3) {return n;}
	return commafyRH(n.substring(0,n.length()-3)) //Everything before the last three digits
	    + ","
	    + n.substring(n.length()-3,n.length()); //Last three digits
    }//End commafyRH
    public static String commafyF(int n) {
	if (n == 0) {return "0";}
	String sub = "";
	String subSub = "";
	for (; n > 100; n /= 1000) {
	    subSub = Integer.toString(n % 1000); //String of last three digits
	    while (subSub.length() < 3) {subSub += "0";} //Ensures something like 1000 won't output 1,0
	    sub = ("," + subSub) + sub;
	}
	if (n == 0) {return sub.substring(1);}
	return Integer.toString(n) + sub;
    }//End commafyF
    public static void main(String[] args) {
	/*
	//Recursive version
	for (String s : args) {
	    System.out.println(commafyR(Integer.parseInt(s)));
	}
	*/
	
	//For version
	for (String s : args) {
	    System.out.println(commafyF(Integer.parseInt(s)));
	}

    }//End main
}