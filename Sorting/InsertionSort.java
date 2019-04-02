package diy.learnings.sorting;

public class InsertionSort {

	static void insertionSort(int[] arr) {

		int holePosition;
		int valueToInsert;

		for (int i = 1; i < arr.length; i++) {

			// selecting value to be inserted in sorted sub list
			valueToInsert = arr[i];
			holePosition = i;

			// condition checks the current `value to insert(record)` with the `previous record` value 
			// and if previous value is greater than `value to insert(record)`, then
			// value of current position in array, is replaced with previous value
			// hole position is decremented
			while (holePosition > 0 && arr[holePosition - 1] > valueToInsert) {
				arr[holePosition] = arr[holePosition - 1];
				holePosition = holePosition - 1;
			}

			// current `value to insert(record)` is replaced in the resulting hole position 
			arr[holePosition] = valueToInsert;
		}

	}

	public static void main(String[] args) {

		int[] arr = { 10, 500, 50, 65, 45, 25 };
		insertionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
