package gfg.searching;

// Time complexity : O(log n)
// Auxiliary space complexity: O(1)
public class BinarySearch_1 {

    public static int searchEle(int[] arr, int x) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 30, 30, 30, 30, 40, 50, 60 };
        int x = 70;
        System.out.println("Element is in " + searchEle(arr, x));
    }

}
