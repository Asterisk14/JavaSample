import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Fibonacci
{
    public static void main (String[] args) throws java.lang.Exception
    {
        
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Start of program");
        System.out.println("Enter how many fibnacci numbers you want to print:");
        int number = reader.nextInt();
        System.out.println("***Fibonnaci numbers***");
        printFiboSeries(number);
        System.out.println();
        System.out.println("***Fibonnaci numbers***");
        System.out.println("End of program");
    } // end of main
    
    public static void printFiboSeries(int number)
    {
        int first = 0;
        int second = 1;
        int third = 0 ;
        
        if(number==0)
        {
            System.out.println(" Sorry we cant print zero numbers");
            return;
        }
        else if(number==1)
        {
             System.out.println(first + " ");
        }
        else if (number ==2)
        {
            System.out.println(first + " " + second + " ");  
        }
        else 
        {
            third = first + second;
            System.out.print(first + " " + second + " " + third);
        }
        
        if(number >3){
        for (int j = 1; j<= number-3; j++)
        {
            first = second;
            second = third;
            third = first + second;
            System.out.print(" " + third);
        }// end of for
        System.out.println();
        }
    }//end of function
  }//end of class
