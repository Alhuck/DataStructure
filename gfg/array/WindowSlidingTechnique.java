package gfg.array;

//Time complexity: O(n)
public class WindowSlidingTechnique {

    public static int getMaxSumOfKElementsInArray(int[] arr, int k) {
        int res = 0;
        int current_sum = 0;
        // find the sum upto first 'K' elements in the array
        for (int i = 0; i < k; i++) {
            current_sum = current_sum + arr[i];
        }
        res = current_sum;
        // once current sum of first 'K' elements are found, 
        // then add one element on right of array and subtract one element from the start of array
        // below code does that in constant time
        for (int i = k; i < arr.length; i++) {
            current_sum = current_sum + arr[i] - arr[i - k];
            res = Math.max(res, current_sum);
        }

        return res;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 8, 30, -5, 20, 7 };
        int k = 3;
        System.out.println("The maximum sum in the given array for K sub arrays is: " + getMaxSumOfKElementsInArray(arr, k));
    }

}
