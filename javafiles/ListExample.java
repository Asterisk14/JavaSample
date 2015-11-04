import java.util.*;
import java.lang.*;
import java.io.*;

public class ListExample{

	public static void main(String args[])
	{
	List<Integer> list1 = new LinkedList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);		
		list1.add(5);
	System.out.println(list1);
	System.out.println(list1.size());

	}
}