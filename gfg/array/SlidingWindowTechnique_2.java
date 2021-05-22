package gfg.array;

// Time Complexity : O(n)
// Auxiliary Space Complexity : O(1)
public class SlidingWindowTechnique_2 {

    public static boolean getSubArraySumIsPresent(int[] arr, int givenSum) {

        // idea is : adding the array ele to zero, till it reaches above or equal to the given sum
        // if current_sum is greater than given sum, then subtracting the start of array ele to find
        // whether given sum is present of not
        int start = 0;
        int current_sum = arr[0];

        for (int end = 1; end <= arr.length; end++) {

            // if current_sum greater than given sum, subtracting the starting ele of array from the current_sum
            while (current_sum > givenSum && start < end - 1) {
                current_sum = current_sum - arr[start];
                start++;
            }

            if (current_sum == givenSum) {
                return true;
            }

            // adding the ele until it reaches equal or greater than given sum
            if (end < arr.length) {
                current_sum = current_sum + arr[end];
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 4, 20, 3, 10, 5 };
        // int[] arr = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int sum = 33;
        System.out.println("The given sum is present in the sum of given array's sub array: " + getSubArraySumIsPresent(arr, sum));
    }

}
