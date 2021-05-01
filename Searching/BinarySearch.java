package Searching;

public class BinarySearch {

    static Integer[] arr = new Integer[] { 01, 40, 78, 80, 645 };

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
        // sortArr();
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int midpoint = low + ((high - low) / 2);

            if (arr[midpoint] == searchItem) {
                return midpoint;
            }

            if (arr[midpoint] > searchItem) {
                low = midpoint + 1;
            }

            if (arr[midpoint] < searchItem) {
                high = midpoint - 1;
            }

        }

        return -1;

    }

    public static void main(String[] args) {

        Integer searchItemIndex = binarySearch(80);
        if (searchItemIndex != null) {
            System.out.println("The element is found at " + searchItemIndex + " position of given sorted array");
        }
    }

}
