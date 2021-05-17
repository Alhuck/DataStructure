package gfg.array;

// Time complexity for preprocessing array : O(n)
// Time complexity for getting sum : O(1) - constant time
public class PrefixSum {

    public static int getSumBetwnRange(int[] arr, int left, int right) {

        // prepossing the given array with new array to calculate the prefixSum values
        int[] prefixSumArr = new int[arr.length];
        prefixSumArr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSumArr[i] = prefixSumArr[i - 1] + arr[i];
        }

        // with the preprocessed prefix sum array,
        // we can fetch the sum for the given range in O(1) constant time
        if (left != 0) {
            return prefixSumArr[right] - prefixSumArr[left - 1];
        } else {
            return prefixSumArr[right];
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] arr = { 2, 8, 3, 9, 6, 5, 4 };
        System.out.print(getSumBetwnRange(arr, 0, 2) + " ");
        System.out.print(getSumBetwnRange(arr, 1, 3) + " ");
        System.out.print(getSumBetwnRange(arr, 2, 6) + " ");
    }

}
