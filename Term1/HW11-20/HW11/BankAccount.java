// Team Back for Seconds, Team #2
// Xinyi Huang, Stefan Tan, Adrian Kloskowski 
// APCS1 pd8
// HW10 -- Mo Money Mo Problems 
// 2017-10-03 

public class BankAccount
{
    //instance variables
    private static String name;
    private static String passwd;
    private static int pin;
    private static int acctNum;
    private static double balance;


    //mutators
    public static String setName( String newName )
    {
	String oldName = name;
	name = newName;
	return oldName;
    }

    public static String setPasswd( String newPasswd )
    {
	String oldPasswd = passwd;
	passwd = newPasswd;
	return oldPasswd;
    }
    // sets PIN to a 4-digit number,
    // if it is invalid it returns an error message
    public static int setPin( int newPin )
    {
	if (1000 <= newPin && newPin <= 9998){
	    int oldPin = pin;
	    pin = newPin;
	    return oldPin;
	}
	else {
	    pin = 9999;
	    System.out.print("The input is invalid. Please enter a 4-digit number. Your account number is set to ");
	    return (9999);

	}
    }

    // sets Account Number to a 9-digit number,
    // if it is invalid it returns an error message
    public static int setAcctNum( int newAcctNum )
    {
	if (100000000 <= newAcctNum && newAcctNum <= 999999998){
	    int oldAcctNum = acctNum;
	    acctNum = newAcctNum;
	    return oldAcctNum;
	}
	else {
	    acctNum = 999999999;
	    System.out.print("The input is invalid. Please enter a 9-digit number. Your account number is set to ");
	    return (999999999);
	}
    }

    public static double setBalance( double newBalance )
    {
	double oldBalance = balance;
	balance = newBalance;
	return oldBalance;
    }

    public void deposit( double depositAmount ) {
	balance = balance + depositAmount;
    }

    // deducts money from the balance,
    // if there is not enough money prints out error message

    public static boolean withdraw(double withdrawAmount){
	if (withdrawAmount <= balance){
	    balance -= withdrawAmount;
	    return true;
	}
	else{
	    System.out.println("The account does not have enough money.");
	    return false;
	} 
    }

    // verifies if the credentials are valid for this Bank Account and
    // return true, if not return false
    public static boolean verify(int inAcctNum, int inPin){
	if (inAcctNum == acctNum && inPin == pin){ 
	    return true;
	}
	else{
	    return false;
	}
    }


    //overwritten toString()
    public String toString() {
	String retStr = "\nAccount info:\n=======================";
	retStr = retStr + "\nName: " + name;
	retStr = retStr + "\nPassword: " + passwd;
	retStr = retStr + "\nPIN: " + pin;
	retStr = retStr + "\nAccount Number: " + acctNum;
	retStr = retStr + "\nBalance: " + balance;
	retStr = retStr + "\n=======================";
	return retStr;
    }


    //main method for testing
    public static void main( String[] args )
    {
	System.out.println(setAcctNum(123));
	System.out.println(setPin(123));
	setBalance(1000000);
	withdraw(100000000);
	System.out.println(verify(999999999,9999));

      
    }//end main()

}//end class BankAccount

