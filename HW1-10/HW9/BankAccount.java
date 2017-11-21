/*
Team 4 (JKK)
APCS1 pd8
HW9 -- CMYM
2017-10-02
 */
public class BankAccount {
    private static int pin;
    private static int accNum;
    private static double bal;
    private static String pass;
    private static String accountOwner;
    /* public BankAccount() {
	pin = 1111;
	accNum = 111111111;
	bal = 0;
	pass = "helloworld";
	accountOwner = "Bob";
    }
    public BankAccount(int newPin, int newAccNum, String newPass, String name) {
	pin = newPin;
	accNum = newAccNum;
	pass = newPass;
	accountOwner = name;
    } */
    public static void main(String[] args) {
	pin = 1111;
	accNum = 111111111;
	bal = 0;
	pass = "helloworld";
	accountOwner = "Bob";
	checkInfo("helloworld",1111);
       	changePass("password","helloworld",1111);
       	changePin(2222,"password",1111);
	deposit(100,"password",2222);
	withdraw(5,"password",2222);
	checkInfo("password",2222);
    }
    private static boolean verify (String accPass, int accPin) {
	if (accPass == pass && accPin == pin) {
	    return true;
	}
	else {
	    return false;
	}
    }
    public static boolean changePass(String newPass, String oldPass, int accPin) {
	if (verify(oldPass,accPin)) {
	    pass = newPass;
	    return true;
	}
	else {
	    return false;
	}
    }
    public static boolean changePin(int newPin, String accPass, int oldPin) {
	if (verify(accPass,oldPin)) {
	    pin = newPin;
	    return true;
	}
	else {
	    return false;
	}
    }
    public static boolean withdraw(double amount, String accPass, int accPin) {
	if (verify(accPass,accPin) && amount <= bal) {
		bal -= amount;
		return true;
	    }
	else {
	    return false;
	}
    }
    public static boolean deposit(double amount, String accPass, int accPin) {
	if (verify(accPass,accPin)) {
	    bal += amount;
	    return true;
	}
	else {
	    return false;
	}
    }
    public static void checkInfo(String accPass, int accPin) {
	if (verify(accPass,accPin)) {
	    System.out.println("Account Owner: " + accountOwner);
	    System.out.println("Password: " + pass);
	    System.out.println("Pin: " + pin);
	    System.out.println("Balance: " + bal);
	    System.out.println("Account Number: " + accNum);
	}
	else {
	    System.out.println("Invalid Password/Pin");
	}
    }
}
