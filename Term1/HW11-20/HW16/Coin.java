/*
Kevin Lin
APCS1 pd8
HW15 -- Get It While You Can
2017-10-12
*/

public class Coin {
	//instance variables
    private double value;
    private String upFace;
    private String name;
    private int flipCtr;
    private int headsCtr;
    private int tailsCtr;
    private double bias;

    public Coin() {
    	upFace = "heads";
    	bias = 0.5;
    }

    public Coin(String newName) {
    	this(); //Calls default constructor
    	name = newName;
    	assignValue();
    }

    public Coin(String newName, String currentFace) {
    	this(newName); //Calls first overloaded constructor
    	upFace = currentFace;
    }

    public String toString() {
    	return (name + " -- " + upFace);
    }

    public boolean equals(Coin other) {
    	if (other.upFace == upFace) {
    		return true;
		}
		return false;
    }

    private void assignValue() {
    	if (name == "quarter") {
    		value = 0.25;
    	}
    	else if (name == "penny") {
    		value = 0.01;
    	}
    	else if (name == "dime") {
    		value = 0.1;
    	}
    	else if (name == "dollar") {
    		value = 1.0;
    	}
    	else if (name == "nickel") {
    		value = 0.05;
    	}
    }
    
    public String flip() { //If bias is 1.0, it will always land on heads, if it's 0.0, it will always land on tails
    	if (Math.random() >= bias) { //Math.random returns a float 0.0 <= x < 1.0
    		upFace = "tails";
    		tailsCtr += 1;
    		flipCtr += 1;
    		return "tails";
    	}
    	upFace = "heads";
    	headsCtr += 1;
    	flipCtr += 1;
    	return "heads";
    }
    
    public void reset() {
    	flipCtr = 0;
    	tailsCtr = 0;
    	headsCtr = 0;
    }
    
    public void flipInfo() {
    	System.out.println("============================");
    	System.out.println("Number of tails: " + tailsCtr);
    	System.out.println("Number of heads: " + headsCtr);
    	System.out.println("Number of flips: " + flipCtr);
    }
}
