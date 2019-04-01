package diy.learnings.sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int[] unsortedArray = { 23, 10, 65, 4, 3 };
		for (int i = 0; i < unsortedArray.length - 1; i++) {

			boolean swapped = false; // to prevent unwanted iteration on sorted array
			for (int j = 0; j < unsortedArray.length - 1; j++) {
				if (unsortedArray[j] > unsortedArray[j + 1]) {

					// swapping the elements 
					// if adjacent element is larger than the current element
					int temp = unsortedArray[j];
					unsortedArray[j] = unsortedArray[j + 1];
					unsortedArray[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
		
		for (int i = 0; i < unsortedArray.length; i++) {
			System.out.print(unsortedArray[i] + " ");
		}
	}
}