/*
Kevin Lin
APCS pd8
HW20 -- For the ~~Lulz~~ Love of Strings
2017-10-19
*/
public class Foresrever {

    public static String fenceF(int posts) {
	if (posts == 0) {return "";}
	String sub = "|";
	for (int ctr = 0; ctr < posts; ctr++) {sub += "--|";}
	return sub;
    }//End fenceF

    public static String reverseF(String s) {
	String sub = "";
	for (int ctr = 1; ctr <= s.length(); ctr ++) {
	    sub += s.substring(s.length() - ctr,s.length() - ctr + 1);
	}
	return sub;
    }//End reverseF

    public static String reverseR(String s) {
	if (s.length() == 1) {return s;}
	return reverseR(s.substring(1)) + s.substring(0,1);
    }//End reverseR

    public static void main(String[] args) {
	System.out.println("======= fenceF(posts) =======");
	System.out.println(fenceF(4));
	System.out.println(fenceF(0));
	System.out.println(fenceF(1));
	System.out.println("======= reverseF(s) =======");
	System.out.println(reverseF("stressed"));
	System.out.println(reverseF("Hello, world!"));
	System.out.println(reverseF("A"));
	System.out.println("======= reverseR(s) =======");
	System.out.println(reverseR("stressed"));
	System.out.println(reverseR("Hello, world!"));
	System.out.println(reverseR("A"));
    }//End main
}