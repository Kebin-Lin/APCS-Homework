/*
Kevin Lin
APCS1 pd8
HW6 -- On BigSib Individuality and the Elimination of Radio Fuzz
2017-9-25
*/
public class BigSib {
    private static String helloMsg;
    public static void setHelloMsg(String msg) {
	helloMsg = msg;
    }
    public static String greet(String name) {
	return helloMsg + name;
    }
}