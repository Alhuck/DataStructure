package gfg.searching;

// Time Complexity: O(log n)
// Space Complexity: O(1)
public class CountDuplicates {

    public static int getTotalDuplicateCount(int[] arr, int size, int searchEle) {

        // getting the first occurance index of the search elem in the array
        int firstOccurance = FirstOccElement.getElementIndex(arr, size, searchEle);
        // firstOccurance will be -1 if the element not present, then duplicate element count will be 0
        if (firstOccurance < 0) {
            return 0;
        }

        // getting the last occurance index of the search elem in the array,
        // since the element is found its first occurance, ele will be found in this method as well,
        // so this method can't return -1
        int lastOccurance = LastOccElement.getElementIndex(arr, size, searchEle);

        // formula to find the total count of the given ele in the array
        return lastOccurance - firstOccurance + 1;
    }

    public static void main(String[] args) {

        // int[] arr = { 10, 20, 20, 20, 30, 30 };
        int[] arr = { 5, 10, 10, 15, 15 };
        int size = arr.length;
        int searchEle = 15;

        System.out.println("The total count of the given ele in the array is: " + getTotalDuplicateCount(arr, size, searchEle));
    }

}
