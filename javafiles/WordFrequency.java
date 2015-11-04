import java.util.*;
import java.lang.*;
import java.io.*;
//import java.util.*;

public class WordFrequency{

	public static void main(String args[]){
		Map<String, Integer> m = new HashMap<String,Integer>();
		
		
		for (String a: args)
		{

/** 
why are we getting it from an 
empty map, are we trying to avoid null plus some operation
I was thinking it in this way - we create a new empty map to populate it with the 
input and frequency from arguments
I did not think that I will have to get something from an empty map first?
**/
			Integer frequency = m.get(a); 
			m.put(a,(frequency==null) ? 1:frequency+1);
		}
	
//System.out.println(m.size() + " distinct words:");
       System.out.println(m);
Map<String, Integer> copy = new HashMap<String,Integer>(m);
       System.out.println(copy);
	
	}
}





/************************

import java.util.*;


public class Freq {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<String, Integer>();

        // Initialize frequency table from command line
        for (String a : args) {
            Integer freq = m.get(a);
            m.put(a, (freq == null) ? 1 : freq + 1);
        }

        System.out.println(m.size() + " distinct words:");
        System.out.println(m);
    }
}
******************/