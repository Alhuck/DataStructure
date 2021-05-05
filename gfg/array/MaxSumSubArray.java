package gfg.array;

public class MaxSumSubArray {

    public static int getMaxSumSubArray(int[] arr) {

        int res = arr[0];
        int maxEnding = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(maxEnding, res);
        }

        return res;

    }

    public static void main(String[] args) {

        int[] arr = { 2, 3, -8, 7, -1, 2, 3 };
//        int[] arr = { 5, 8, 3 };
//        int[] arr = { -6, -1, -8 };        
        System.out.println("The Maximum sum of the sub array is: " + getMaxSumSubArray(arr));
    }

}
