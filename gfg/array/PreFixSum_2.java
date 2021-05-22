package gfg.array;

// Time complexity : O(n)
// Auxiliary space complexity: O(1)
public class PreFixSum_2 {

    public static boolean isEquilibriumArray(int[] arr) {

        int sum = 0; // stores the total sum of the given array
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        // stores the sum of element left
        // to the current index of the array in the loop
        int left_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // each index equlibrium point is checked to return
            if (left_sum == (sum - arr[i])) {
                return true;
            }
            // if no equilibrium pt, then left sum is added to current index ele
            // total sum is subtracted from the current index ele
            left_sum = left_sum + arr[i];
            sum = sum - arr[i];
        }
        return false;
    }

    public static void main(String[] args) {

        // int[] arr = { 3, 4, 8, -9, 20, 6 };
        // int[] arr = { 4, 2, -2 };
        int[] arr = { 4, 2, 2 };
        System.out.println("The given array has equilibrium point : " + isEquilibriumArray(arr));

    }

}
