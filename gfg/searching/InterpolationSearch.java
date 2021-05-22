package gfg.searching;

public class InterpolationSearch {

	static Integer[] arr = new Integer[] { 50, 45, 32, 51, 43, 52, 65 };

	static void sortArr() {

		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			if (min != i) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
	}

	static Integer interpolationSearch(int searchItem) {

		sortArr();
		int low = 0;
		int midpoint = -1;
		int high = arr.length - 1;
		boolean dataFound = false;

		while (!dataFound) {

			if (low == high || arr[low] == arr[high]) {

				System.out.println("data not found");
				break;
			}
			midpoint = low + ((high - low) / (arr[high] - arr[low])) * (searchItem - arr[low]);

			if (arr[midpoint] == searchItem) {

				dataFound = true;
				return midpoint;
			} else {

				if (arr[midpoint] < searchItem) {
					low = midpoint + 1;
				} else if (arr[midpoint] > searchItem) {
					high = midpoint - 1;
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {

		Integer searchItemIndex = interpolationSearch(65);
		if (searchItemIndex != null) {
			System.out.println("The element is found at " + searchItemIndex + " position of given sorted array");
		}
	}

}
