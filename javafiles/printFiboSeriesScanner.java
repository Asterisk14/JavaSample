import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Fibonacci
{
    public static void main (String[] args) throws java.lang.Exception
    {
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter how many fibnacci numbers you want to print:");
        int number = reader.nextInt();
        printFiboSeries(number);
    } // end of main
    
    public static void printFiboSeries(int number)
    {
        int first = 0;
        int second = 1;
        int third = first + second;
        System.out.print(first + " " + second + " " + third);
        
        for (int j = 1; j<= number-3; j++)
        {
            first = second;
            second = third;
            third = first + second;
            System.out.print(" " + third);
        }// end of for
  System.out.println();
    }//end of function
  
}//end of class
