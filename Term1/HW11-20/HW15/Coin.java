/*
Kevin Lin
APCS1 pd8
HW15 -- Wayne's World
2017-10-11
*/

public class Coin {
	//instance variables
    public double value;
    public String upFace;
    public String name;
    public int flipCtr;
    public int headsCtr;
    public int tailsCtr;
    public double bias;

    public Coin() {
	assignValue(1);
	upFace = "heads";
	bias = 0.5;
    }

    public Coin(String newName) {
	this(); //Calls default constructor
	name = newName;
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

    public void assignValue(double val) {
	value = val;
    }
    
    public String flip() { //If bias is 1.0, it will always land on heads, if it's 0.0, it will always land on tails
    	if (Math.random() >= bias) { //Math.random returns a float 0.0 <= x < 1.0
    		upFace = "tails";
    		return "tails";
    	}
    	upFace = "heads";
    	return "heads";
    }
}
