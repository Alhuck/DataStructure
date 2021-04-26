package gfg.recurssion;

public class SubsetSumProblem {

    public static int subsetSum(int[] arr, int n, int sum) {
        if (n == 0) {
            return sum == 0 ? 1 : 0;
        }

        return subsetSum(arr, n - 1, sum) + subsetSum(arr, n - 1, sum - arr[n - 1]);
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3 };
        int n = arr.length;
        int sum = 2;

        System.out.println("Total # of subsets are: " + subsetSum(arr, n, sum));
    }

}
