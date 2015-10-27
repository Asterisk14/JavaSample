package assignment;
public class Book{
	private String bookId;
	private String bookName;
	private double bookPrice;
	private String bookDescription;
	private int availableQuantity;
	BookInventory bookInventory;
	public Book(String bookId, String bookName, double bookPrice, String bookDescription, int availableQuantity) {
		this.bookId	= bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDescription =bookDescription;
		this.availableQuantity  =availableQuantity;		
	}// end of book's constructor

	public String toString()
	{
		return "Id:=  " + bookId + "| Name:= " + bookName+ "| Description:= " + bookDescription + 
		"| Price:= "+bookPrice + "| Available Quanitity:=" +availableQuantity ;
	}// end of toString method

	public String getBookId() {
		return bookId;
	} // end of getter for book id method

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}// end of setter for book id method
	
	
	public String getBookName() {
		return bookName;
	}// end of getter for book name method

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}// end of setter for book name method

	public double getBookPrice() {
		return bookPrice;
	}// end of getter for book price method

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}// end of setter for book price method

	public String getBookDescription() {
		return bookDescription;
	}// end of getter for book description method

	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}//end of setter for book description method

	public int getAvailableQuantity() {
		return availableQuantity;
	}// end of getter for available quantity method

	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}//end of setter for available quantity method



}// end of Book class
