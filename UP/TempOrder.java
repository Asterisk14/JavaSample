package assignment;

import java.util.ArrayList;
import java.util.List;



public class TempOrder {
	int orderId =0;
	String orderDate = "06 july 2012";
	int orderQuantity = 2;
	int confirmationNumber =0;
	String bookName ="DBMS";
	double orderTotal ;
	static Book myBook;
	static Customer myCustomer;
	String customerId = "1001C";
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}


	static List<TempOrder> myOrder = new ArrayList<TempOrder>(); 

	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	
	}
	public double getOrderTotal() {
		return myBook.getBookPrice()* getOrderQuantity();
	}
	public int getOrderId() {
		orderId++;
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public int getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	public int getConfirmationNumber() {
		confirmationNumber++;
		return confirmationNumber;
	}
	public void setConfirmationNumber(int confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public static void main(String[] args){
		createOrder();

	}	
	
	public String toString()
	{
		return "Id:=  " + orderId + "| Name:= " + bookName+ "| OrderDate:= " + orderDate + 
		"| Order Total:= "+orderTotal + "| Confirmation Number:=" +confirmationNumber + "| CustomerId:=" +customerId ;
	}// end of toString method

	
	public static void createOrder(){
		TempOrder tempOrder = new TempOrder();
		myBook = new Book("101","DBMS",50.00,"Database managment systems",10);
		myCustomer = new Customer("1001C","John","Doe","JD1","1001","Omaha","Omaha", "100110011");
		System.out.println("Book Name "+tempOrder.getBookName());
		System.out.println("Book Quantity in inventory is "+	myBook.getAvailableQuantity());
		System.out.println("Order Quantity "+tempOrder.getOrderQuantity());
		System.out.println("Order Id "+tempOrder.getOrderId());
		System.out.println("Order Total "+tempOrder.getOrderTotal());
		System.out.println("Confirmation Number "+tempOrder.getConfirmationNumber());
		System.out.println(" Order Date "+tempOrder.getOrderDate());
		System.out.println("The price of this book in databse id "+myBook.getBookPrice());
		System.out.println("The order is placed for customer "+myCustomer.getCustomerFirstName());
		myOrder.add(tempOrder);
		System.out.println("****************"+tempOrder);
		
	}

}// end of class
