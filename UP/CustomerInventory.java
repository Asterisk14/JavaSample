package assignment;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class CustomerInventory {
	private Collection<Customer> customerList = new LinkedList<Customer>();
	CustomerInventory(){
		addCustomerInformation();
	}

	public void addCustomerInformation(){
		customerList.add(new Customer("1001C","John","Doe","JD1","1001","Omaha","Omaha", "100110011"));
		customerList.add(new Customer("1002C","Jane","Doe","JD2","1002","Lincoln","Lincoln", "100110012"));
		customerList.add(new Customer("1003C","Julie","Doe","JD3","1003","Fremont","Fremont", "100110013"));
		customerList.add(new Customer("1004C","Jackson","Doe","JD4","1004","Kearney","Kearney", "100110014"));
		customerList.add(new Customer("1005C","Jeremiah","Doe","JD5","1005","DeMoines","DeMoines", "100110015"));

	}//end of addCustomerInformation method
	public void displayCustomerInformation(){
		System.out.println(customerList);
	}

}//end of CustomerInventory Class