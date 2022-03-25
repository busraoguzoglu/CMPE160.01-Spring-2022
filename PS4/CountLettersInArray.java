import java.util.Arrays;
import java.util.Random;

public class CountLettersInArray {
	
	/** Main method */
	public static void main(String[] args) {
		// Declare and create an array
		char[] chars = createArray();

		// Display the array
		System.out.println("The lowercase letters are:");
		displayArray(chars);

		//Count the occurrences of each letter
		int[] counts = countLetters(chars);

		// Display counts
		System.out.println();
		System.out.println("The occurrences of each letter are:");
		displayCounts(counts);
	}

	/** Create an array of characters */
	public static char[] createArray() {
		// Declare an array of characters and create it
		char[] chars = new char[100];

		// Create lower case letters randomly and assign
		// them to the array
		for (int i = 0; i < chars.length; i++) {
			
			//A random character between 'a' and 'z':
			// 97 corresponds to 'a', 122 corresponds to 'z'
			Random r = new Random();
			char c = (char)(r.nextInt(26) + 'a');
			chars[i] = c;

		}

		// Return the array
		return chars;
	}

	/** Display the array of characters */
	public static void displayArray(char[] chars) {
		// Display the characters in the array 20 on each line
		for (int i = 0; i < chars.length; i++) {
			if ((i + 1) % 20 == 0)
				System.out.println(chars[i]);
			else
				System.out.print(chars[i] + " ");
		}
	}

	/** Count the occurrences of each letter */
	public static int[] countLetters(char[] chars) {
		// Declare and create an array of 26 int
		int[] counts = new int[26];

		// For each lowercase letter in the array, count it
		for (int i = 0; i < chars.length; i++) {
			//chars[i] gives a letter, for example 'b'
			//each letter has a location on counts array.
			//when we encounter a letter on chars array,
			//we want to increase its count on counts array.
			counts[chars[i] - 'a']++;
		}
		return counts;
	}

	/** Display counts */
	public static void displayCounts(int[] counts) {
		for (int i = 0; i < counts.length; i++) {
			if ((i + 1) % 10 == 0)
				System.out.println(counts[i] + " " + (char)(i + 'a'));
			else
				System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
		}
	}
}