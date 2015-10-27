package assignment;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class BookInventory {
	
	BookInventory(){
		addBookToInventory();	
	}
	
	private static Collection<Book> bookList ;
	Iterator<Book> bookIterator;

	public void addBookToInventory(){
		bookList = new LinkedList<Book>();
		bookList.add(new Book("101","DBMS",50.00,"Database managment systems",10));
		bookList.add(new Book("102","UML",100.00,"Unified Modelling language",20));
		bookList.add(new Book("103","ECLIPSE",25.00,"Integrated Development Environment for Java",30));
		bookList.add(new Book("104","MAVEN",25.00,"Build framework and Project management tool ",40));
		bookList.add(new Book("105","DESIGN PATTERNS",100.00,"Patterns",50));
	}//end of addBookToInventory method

	public static void main(String[] args) {		
		BookInventory b = new BookInventory();
		b.addBookToInventory();
		b.displayBooks();
	}

	public void displayBooks() {		
		System.out.println("The list of books we have is :");
		for(Book book : bookList) {
			System.out.println(book);
		}//end of for loop
	}//end of display method

}//end of BookInventory class
