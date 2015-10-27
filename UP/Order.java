package assignment;

import java.util.Collection;
import java.util.LinkedList;

public class Order {
	private String customerId;
	Order(String customerId){
		this.customerId= customerId;

	}
	private int orderId;
	private String orderDate = "June 6,2012";
	private int orderedQuantity;
	Collection<Order> placedOrders = new LinkedList<Order>();
	Book myBook;
	Customer myCustomer;
	BookInventory bookInventory;
	CustomerInventory customerInventory;
	public int confirmationNumber;





	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		orderId++;
		this.orderId = orderId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public double getOrderTotal() {
		double orderTotal = myBook.getBookPrice()* myBook.getAvailableQuantity();		
		return orderTotal;
	}








	public static void main(String[] args){			
		Book myBook = new Book("101","DBMS",50.00,"Database managment systems",10);
		Customer myCustomer = new Customer("1001C","John","Doe","JD1","1001","Omaha","Omaha", "100110011");
		Order myOrder = new Order(myCustomer.customerId);
		myOrder.createOrder(myOrder.orderId,myOrder.orderDate, myOrder.orderedQuantity,myBook.getBookName());


	}// end of main method

}// end of order class
