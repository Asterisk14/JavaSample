/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class WordCounter
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		// printSeries(5);
		String text = "Twinkle, twinkle, little star, How I wonder what you are. Up above the world so high, Like a diamond in the sky. When the blazing sun is gone, When he nothing shines upon, Then you show your little light, Twinkle, twinkle, all the night. Then the traveler in the dark, Thanks you for your tiny spark, He could not see which way to go, If you did not twinkle so. In the dark blue sky you keep, And often through my curtains peep, For you never shut your eye, Till the sun is in the sky. As your bright and tiny spark, Lights the traveler in the dark. Though I know not what you are, Twinkle, twinkle, little star. Twinkle, twinkle, little star. How I wonder what you are. Up above the world so high, Like a diamond in the sky. Twinkle, twinkle, little star. How I wonder what you are. How I wonder what you are."
		WordCount(text);
	}
	
	public static void WordCount(String text)
	{
		// Create a new StringBuilder.
		StringBuilder builder = new StringBuilder();

		builder.append(text.replaceAll("[.,]", "");
        String[] words= builder.toString().split("\\s+");
		Map<String, String> wordFrequency = new HashMap<String, String>();
		for (String word: words) {
		    if(!wordFrequency.containsKey(word)) {
				wordFrequency.put(word, 1);
			}
			else {
				wordFrequency.put(word, wordFrequency.get(key) + 1)
			}
        }
		for (Map.Entry<String, String> entry : wordFrequency.entrySet()) {
				String key = entry.getKey();
				String value = entry.getValue();
				System.out.println(key + ":" + value);
		}
        
    }
}
