import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a string:
		System.out.println("Please enter a string");
		String s = input.nextLine();
		
		// The index of the first character:
		int low = 0;
		
		// The index of the last character:
		int high = s.length() - 1;
		
		boolean isPalindrome = true;
		
		while(low < high) {
			
			if(s.charAt(low)!= s.charAt(high)) {
				isPalindrome = false;
				break;
			}
			
			low++;
			high--;
		}
		if(isPalindrome) {
			System.out.println(s + " is a palindrome");
		}
		else {
			System.out.println(s + " is not a palindrome");
		}
		
	
	}
	
	
}





The first 50 prime numbers are
2 3 5 7 11 13 17 19 23 29
31 37 41 43 47 53 59 61 67 71
73 79 83 89 97 101 103 107 109 113
127 131 137 139 149 151 157 163 167 173
179 181 191 193 197 199 211 223 227 229










