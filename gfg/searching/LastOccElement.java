package gfg.searching;

// Time complexity : O(log n)
// Space complexity: O(1)
public class LastOccElement {

    public static int getElementIndex(int[] arr, int size, int searchEle) {

        int low = 0;
        int high = size - 1;
        while (low <= high) {

            int mid = (low + high) / 2;
            // when the mid matches the search elem,
            // again the mid is grinded inside this block to find the last occurance
            if (arr[mid] == searchEle) {
                // mid index is the last index of array or
                // mid + 1 index ele is not equal to mid index ele of array,
                // then it is the last ele
                if (mid == size - 1 || arr[mid] != arr[mid + 1]) {
                    return mid;
                } else {
                    low = mid + 1;
                }

            } else if (arr[mid] > searchEle) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 5, 10, 10, 10, 10, 20, 20 };
        int size = arr.length;
        int searchEle = 20;
        // int searchEle = 10;
        System.out.println("The first Index of the elem is :" + getElementIndex(arr, size, searchEle));
    }

}
