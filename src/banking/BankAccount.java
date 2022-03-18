package banking;

/**
 * Represents a checking/savings bank account for a customer.
 * @author gourav.rajput
 *
 */
public class BankAccount {

	// instance variables
	
	/**
	 * Type of account (checking/savings)
	 */
	String accountType;
	
	/**
	 * Balance for bank account
	 */
	double balance;
	
	/**
	 * customer for this account
	 */
	Customer customer;
	
	//constructor
	
	/**
	 * Creates a bank account of a given type for given customer.
	 * @param accountType for bank account
	 * @param customer for bank account
	 */
	public BankAccount(String accountType, Customer customer) {
		this.accountType = accountType;
		this.customer = customer;
	}
	
	//methods
	
	/**
	 * Deposit the given amount
	 * @param amount to add to balance
	 */
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	/**
	 * Withdraw a given amount
	 * @param amount to withdraw
	 * @throws Exception if the amount is larger than available balance
	 */
	public void withdrawn(double amount) throws Exception {
		if(amount > this.balance) {
			throw new Exception("Amount is grater than available balance.");
		}
		this.balance -= amount;
	}
	
	/**
	 * Returns account type and balance for the bank account.
	 * @return string with all the info
	 */
	public String getAccountInfo() {
		return this.accountType + ": INR " + this.balance;
	}
	
	/**
	 * Return customer's name and address for this bank account.
	 * @return string with all the info
	 */
	public String getCustomerInfo() {
		return this.customer.getName() + " from " + this.customer.getAddress();
	}
}
