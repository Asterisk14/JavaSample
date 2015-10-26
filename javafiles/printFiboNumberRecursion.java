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
        System.out.println("Enter which fibnacci number you are looking for:");
        int number = reader.nextInt();
        System.out.println("***Fibonnaci numbers***");
        int fiboNumber = printFiboNumberRecusrive(number);
        System.out.println(fiboNumber);
        System.out.println("***Fibonnaci numbers***");
        System.out.println("End of program");
    } // end of main
    
    public static int printFiboNumberRecusrive(int number)
    {
        if (number==0)
        {
            return 0;
        }
        
        else if(number==1) 
        {
            return 1;
        }
        else 
        {
            return printFiboNumberRecusrive(number-1) + printFiboNumberRecusrive(number-2) ;
            
        }
    }//end of function
  }//end of class
