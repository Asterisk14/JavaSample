/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		printSeries(5);
	}
	
	public static void printSeries(int number)
	{
		for (int j = 1; j<= number; j++)
		{
			for(int i = 1; i <=j; i=i+1)
			{
				System.out.print(i*number + " ");
			}
			System.out.println();
		}
	}

}