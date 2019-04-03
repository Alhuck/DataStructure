package diy.learnings.searching;

public class BinarySearch {

	static Integer[] arr = new Integer[] { 40, 80, 01, 78, 645 };

	static void sortArr() {

		for (int i = 1; i < arr.length; i++) {

			int valueToInsert = arr[i];
			int holePosition = i;

			while (holePosition > 0 && arr[holePosition - 1] > valueToInsert) {
				arr[holePosition] = arr[holePosition - 1];
				holePosition = holePosition - 1;
			}

			arr[holePosition] = valueToInsert;
		}
	}

	static Integer binarySearch(int searchItem) {

		// sorting the collection before searching
		sortArr();
		int low = 0;
		int high = arr.length;

		boolean dataFound = false;

		while (!dataFound) {
			// checking whether given collection is a valid data collection
			if (high < low) {
				System.out.println("data not found");
				break;
			}
			// formula used to calculate the midpoint for binary search
			int midpoint = low + (high - low) / 2;

			if (arr[midpoint] == searchItem) {
				dataFound = true;
				return midpoint;
			}
			// low value is incremented from mid
			if (arr[midpoint] < searchItem) {
				low = midpoint + 1;
			}

			// mid value is incremented from mid
			if (arr[midpoint] > searchItem) {
				high = midpoint - 1;
			}
		}

		return null;
	}

	public static void main(String[] args) {

		Integer searchItemIndex = binarySearch(100);
		if (searchItemIndex != null) {
			System.out.println("The element is found at " + searchItemIndex + " position of given sorted array");
		}
	}

}
