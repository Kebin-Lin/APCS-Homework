/*
Kevin Lin
APCS pd8
HW17 -- Do I repeat myself?
2017-10-16
*/

public class Repeater {
    public static String fenceW(int numPosts) {
	String sub = "|";
	while (numPosts > 1) {
	    sub += "--|";
	    numPosts -= 1;
	}
	return sub;
    }

    public static String fenceR(int numPosts) {
	if (numPosts == 1) {
	    return "|";
	}
	return fenceR(numPosts - 1) + "--|";
    }

    public static void main(String[] args) {
	System.out.println("======= fenceW(int numPosts) =======");
	System.out.println(fenceW(1)); //Outputs |
	System.out.println(fenceW(3)); //Outputs |--|--|
	System.out.println("======= fenceR(int numPosts) =======");
	System.out.println(fenceR(1)); //Outputs |
	System.out.println(fenceR(5)); //Outputs |--|--|--|--|
    }
}
