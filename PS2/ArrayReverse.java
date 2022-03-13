import java.util.Arrays;

public class ArrayReverse {

	/** The method for reversing a given array */
	public static int[] reverse(int[] myArray) {
		
		// Create a new array
		int[] result = new int[myArray.length];
		
		// Populate result array
		for (int i = 0, j = result.length - 1; i < myArray.length; i++, j--) {
			result[j] = myArray[i];
		}
	
		return result;
	}

	
	public static void main(String[] args) {
		
		int[] array1 = {1, 2, 3, 4, 5, 6};
		int[] array2 = reverse(array1);
		System.out.println("Array 1 is: " + Arrays.toString(array1));
		System.out.println("Array 2 is: " + Arrays.toString(array2));
	
	}
}
