import java.util.Arrays;

public class SelectionSort {
	
	/** The method for sorting the numbers */
	public static void selectionSort(int[] list) {
		
		for (int i = 0; i < list.length - 1; i++) {
			
			// Find the minimum in the list[i..list.length−1]
			int currentMin = list[i];
			int currentMinIndex = i;
			for (int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}

			// Swap list[i] with list[currentMinIndex] if necessary
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] list1 = {2, 1, 6, 4, 3, 5, 7, 9, 8};
		System.out.println("Array is: " + Arrays.toString(list1));
		
		selectionSort(list1);
		System.out.println("Sorted array is: " + Arrays.toString(list1));
		
	}
}