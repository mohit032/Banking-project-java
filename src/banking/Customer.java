package banking;

/**
 * Represents a customers of a bank.
 * @author gourav.rajput
 *
 */
public class Customer {
	// instance variables
	
	/**
	 * Name of customer
	 */
	String name;
	
	/**
	 * Address of customer
	 */
	String address;
	
	//constructor
	
	/**
	 * Creates a customer with the given name	
	 * @param name of customer
	 */
	public Customer(String name) {
		// set instance variable name to the given name
		this.name = name;
	}
	
	/**
	 * sets the address of customer to be given address.
	 * @param address of customer
	 */
	public void setAddress(String address) {
		// set instance variable address to the given address
		this.address = address;
	}
	
	/**
	 * Return customer's name.
	 * @return name of customer
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Returns customers address
	 * @return address of customer
	 */
	public String getAddress() {
		return this.address;
	}
	
	
}
