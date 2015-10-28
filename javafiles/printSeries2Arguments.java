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
        int row =  Integer.parseInt(args[0]);
        int tableOf =  Integer.parseInt(args[1]);
        printSeries(row, tableOf);
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
