package gfg.array;

// Time Complexity: O(n)
public class MaxSumInCircularSubArray {

    // kadane's algorithm to find the max sum in a normal sub array for the given array
    public static int getNormalMaxSumInSubArray(int[] arr) {
        int res = arr[0];
        int maxEnding = arr[0];

        for (int i = 1; i < arr.length; i++) {

            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }

        return res;

    }

    public static void main(String[] args) {

        int[] arr = {5, -2, 3, 4};
        int normalSubArr_Sum = getNormalMaxSumInSubArray(arr);

        // if the normal sub array sum is less than 0, then all elements in array are negative
        // Since the solution to the problem is maximum sum, returning the normalSunArr_sum here is the correct answer
        if (normalSubArr_Sum < 0) {
            System.out.println("The max sum in a circular sub array is : " + normalSubArr_Sum);
            return;
        }

        // this is used to find the maximum values of all the circular sub arrays
        int arr_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr_sum = arr_sum + arr[i];
            arr[i] = -arr[i]; // negating this value, in order to reuse the kadane's algorithm method above and find the minimum value 
        }

        // minimum value found is added to the total sum of array elements to find circular sum of sub array
        int circular_sum = arr_sum + getNormalMaxSumInSubArray(arr); 

        int res = Math.max(normalSubArr_Sum, circular_sum); // max sum of both normal and circular sub array elements are identified and printed
        System.out.println("The max sum in a circular sub array is : " + res);
    }

}
