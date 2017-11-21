/*
Kevin Lin
APCS1 pd8
HW7 -- On the Origins of a BigSib
2017-9-26
*/
public class BigSib {
    private static String helloMsg;
    public BigSib() {
	helloMsg = "Hello ";
    }
    public BigSib(String msg) {
	helloMsg = msg;
    }
    public void setHelloMsg(String msg) {
	helloMsg = msg;
    }
    public String greet(String name) {
	return helloMsg + name;
    }
}