package gfg.searching;

// Time complexity: O(log n)
// Space complexity: O(1)
public class CountOne {

    // idea is : since the array is sorted and it contains only 0's and 1's
    // we have to find the first occurance of 1 then
    // subtract the array's size with first occurance of 1's index

    public static int getCount(int[] arr, int size) {

        int low = 0;
        int high = size - 1;
        while (low <= high) {

            int mid = (low + high) / 2;
            if (arr[mid] == 1) {

                // mid index is the first index of array or
                // mid - 1 index ele is not equal to 1,
                // then it is the first ele
                // else we are searching the left side of the array ele
                if (mid == 0 || arr[mid - 1] != 1) {
                    return size - mid;
                } else {
                    high = mid - 1;
                }

            } else {
                low = mid + 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        // int[] arr = { 0, 0, 0, 1, 1, 1, 1 };
        int[] arr = { 1, 1, 1, 1, 1 };
        int size = arr.length;

        System.out.println("The count of 1's in the given array is : " + getCount(arr, size));
    }

}
