package Sorting;

public class SelectionSort {

	static void selectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			// setting current value of `i` as minimum value
			int min = i;

			// step to identify the position of minimum value in array 
			// by comparing all the other values of array
			// then minimum value is updated with identified new position of array 
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}

			// initial minimum value `i` and updated minimum value is checked,
			// if not equals, then array values in that position is swapped for sorting
			if (min != i) {
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 500, 15, 68, 45, 32, 23, 12 };
		selectionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
