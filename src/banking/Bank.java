package banking;

import java.util.Scanner;

/**
 * Represents a Bank for managing customers and their accounts
 * 
 * @author gourav.rajput
 *
 */
public class Bank {

	public static void main(String[] args) {

		// Creating a new instance of Bank class
		Bank bank = new Bank();

		// calls a run method in bank class
		bank.run();
	}

	public void run() {
		System.out.println("Welcome to the Bank! What is your name? ");

		// create kb to get user input
		Scanner kb = new Scanner(System.in);

		// get the customer's name as input
		String name = kb.nextLine();

		System.out.println("Hello " + name + "! We are creating a checking and savings account for you.");

		// create customer with given name
		Customer customer = new Customer(name);

		// get address
		System.out.print("What is your address? ");

		// get the customer's address as input

		String address = kb.nextLine();

		// set the customer's address
		customer.setAddress(address);

		// creating a checking account for customer
		BankAccount checkingAccount = new BankAccount("Checking", customer);

		// creating a savings account for customer
		BankAccount savingsAccount = new BankAccount("Savings", customer);

		// gets and prints the customer info associated with the checking account.
		System.out.println();
		System.out.println("Customer info: ");
		System.out.println(checkingAccount.getCustomerInfo());

		// gets and prints the account info for checking account.
		System.out.println("Checking account: ");
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println("Savings account: ");
		System.out.println(savingsAccount.getAccountInfo());

		// Deposit

		// into checking
		System.out.println(); // blank line
		System.out.println("Amount to be deposit in checking account: ");
		double amount = kb.nextDouble();
		checkingAccount.deposit(amount);

		// into savings
		System.out.println(); // blank line
		System.out.println("Amount to be deposit in savings account: ");
		amount = kb.nextDouble();
		savingsAccount.deposit(amount);

		// print updated info
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingsAccount.getAccountInfo());

		// Withdraw

		// from checking
		System.out.println(); // blank line
		System.out.println("Amount to be withdraw from checking account: ");
		amount = kb.nextDouble();

		try {
			checkingAccount.withdrawn(amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			// prints custom error message from withdrawn method
			System.out.println(e.getMessage());
		}

		// from savings
		System.out.println(); // blank line
		System.out.println("Amount to be withdraw from savings account: ");
		amount = kb.nextDouble();

		try {
			savingsAccount.withdrawn(amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			// prints custom error message from withdrawn method
			System.out.println(e.getMessage());
		}
		
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingsAccount.getAccountInfo());
		
		kb.close();

	}
}
