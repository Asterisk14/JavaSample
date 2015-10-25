import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
       Scanner reader = new Scanner(System.in);  // Reading from System.in
       System.out.println("Enter number of rows: ");
       int rows = reader.nextInt(); // Scans the next token of the input as an int.
       System.out.println("Enter table of: ");
       int tableOf = reader.nextInt(); // Scans the next token of the input as an int.
       printSeries(rows, tableOf);
    }
    
    public static void printSeries(int number, int tableOf)
    {
        for (int j = 1; j<= number; j++)
        {
            for(int i = 1; i <= j; i++)
            {
                System.out.print(i*tableOf + " ");
            }
            System.out.println();
        }
    }

}
