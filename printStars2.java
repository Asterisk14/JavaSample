/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
       printStars(5);
    }
    
     /*
 n=5
    *
   **
  ***
 ****
*****

n=6

     *
    **
   ***
  ****
 *****
******

*/

public static void printStars(int number)
{

    for (int i = 1; i<=number; i++ ) // i = 1
    {
        for (int k = i; k <=number-1;k++) // k = i= 1 ; k++ ; k = 2 ; k++; k = 3; k++; k =4 ; k=5
        {
            System.out.print(" "); // prints one space ; print 2 space; print 3 space; print 4th space;  come out of loop
        }

        for (int j = 1; j<=i; j++)
        {
            System.out.print("*");
        }
        
            System.out.println();
    }    
}









}