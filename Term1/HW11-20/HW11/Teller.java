/*
Team Ice Cream (Team 4)
Kevin Lin, Shafali Gupta
APCS pd8
HW11 -- Breaking the Bank
2017-10-4
*/

public class Teller {
	public static void main(String[] args) {
		BankAccount bob = new BankAccount();
		System.out.println("=== Should print default account info ===");
		System.out.println(bob);
		bob.setBalance(100);
		System.out.println("=== Balance should be 100 ===");
		System.out.println(bob);
		System.out.println("=== Expecting error ===");
		bob.withdraw(1000);
		bob.setName("Bob");
		bob.setPasswd("thisisapassword");
		bob.setPin(1210);
		bob.setAcctNum(123456789);
		bob.withdraw(5);
		bob.deposit(10);
		System.out.println("=== Expecting updated account info and a balance of 105 ===");
		System.out.println(bob);
		//No authenticate method
		//System.out.println(bob.authenticate("thisisapassword",123456789));
		System.out.println("=== Expecting errors and pass/pin to be set to 9s ===");
		bob.setPin(1);
		bob.setAcctNum(1);
		System.out.println(bob);
		
		//Creating new instance of BankAccount
		BankAccount bobby = new BankAccount();
		System.out.println("=== Should print default account info ===");
		System.out.println(bobby);
		bobby.setPin(9232);
		bobby.setAcctNum(987654321);
		bobby.setName("Bobby");
		System.out.println("=== Expecting Bob's account to have its original information ===");
		System.out.println(bob);
		//Variables are static in BankAccount.java, so different instances have the same values for their variables
	}
}