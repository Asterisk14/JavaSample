package assignment;
public class Customer{
	public String customerId;
	private String customerFirstName;
	private String customerLastName;
	private String customerUserName;
	private String customerPassword;
	private String customerBillingAddress;
	private String customerPhoneNumber;
	CustomerInventory customer;

	public Customer(String customerId, String customerFirstName,String customerLastName,String customerUserName,String customerPassword, String bookDescription, String customerBillingAddress, String customerPhoneNumber) {
		this.customerId= customerId;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.customerUserName = customerUserName;
		this.customerPassword = customerPassword;
		this.customerBillingAddress =customerBillingAddress;
		this.customerPhoneNumber  =customerPhoneNumber;
		customer.displayCustomerInformation();
	}// end of Customer's constructor

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getCustomerUserName() {
		return customerUserName;
	}

	public void setCustomerUserName(String customerUserName) {
		this.customerUserName = customerUserName;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getCustomerBillingAddress() {
		return customerBillingAddress;
	}

	public void setCustomerBillingAddress(String customerBillingAddress) {
		this.customerBillingAddress = customerBillingAddress;
	}

	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public CustomerInventory getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerInventory customer) {
		this.customer = customer;
	}

	public String toString()
	{
		return "customerId =  " + customerId
		+"|FirstName= " + customerFirstName
		+ "|LastName = " + customerLastName 
		+ "|UserName = "+customerUserName 
		+ "|Password = "+customerPassword		
		+ "|BillingAddress =" +customerBillingAddress
		+ "|PhoneNumber " +customerPhoneNumber;
	}// end of toString method
	
	
}// end of customer class