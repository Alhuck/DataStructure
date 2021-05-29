package gfg.searching;

// time complexity : O(log n)
// space complexity: O(1)
public class FirstOccElement {

    public static int getElementIndex(int[] arr, int size, int searchEle) {

        int low = 0;
        int high = size - 1;

        while (low <= high) {

            int mid = (low + high) / 2;
            // when the mid matches the search elem,
            // again the mid is grinded inside this block to find the first occurance
            if (arr[mid] == searchEle) {
                // mid index is the first index of array or
                // mid - 1 index ele is not equal to mid index ele of array,
                // then it is the first ele
                if (mid == 0 || arr[mid - 1] != arr[mid]) {
                    return mid;
                } else {
                    high = mid - 1;
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

        // int[] arr = { 1, 10, 10, 10, 20, 20, 40 };
        int[] arr = { 5, 10, 10, 15, 15 };
        int size = arr.length;
        // int searchEle = 20;
        int searchEle = 15;
        System.out.println("The first Index of the elem is :" + getElementIndex(arr, size, searchEle));
    }

}
