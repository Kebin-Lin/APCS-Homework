/*
Kevin Lin
APCS1 pd8
HW7 -- On the Origins of a BigSib
2017-9-26
*/
public class Greet {
    public static void main( String[] args){
	String greeting;
       
	BigSib richard = new BigSib("Word up, ");
	greeting = richard.greet("freshmen");
	System.out.println(greeting);

	richard.setHelloMsg("Salutations ");
	greeting = richard.greet("Dr. Spaceman");
	System.out.println(greeting);

	richard.setHelloMsg("Hey ya ");
	greeting = richard.greet("Kong Fooey");
	System.out.println(greeting);

	richard.setHelloMsg("Sup ");
	greeting = richard.greet("mom");
	System.out.println(greeting);
    }
}