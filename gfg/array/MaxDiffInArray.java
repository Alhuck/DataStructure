package gfg.array;

public class MaxDiffInArray {

    public static void getMaxDiff(int[] arr) {

        int min = arr[0];
        int res = arr[1] - arr[0];

        for (int i = 1; i < arr.length; i++) {

            res = Math.max(res, (arr[i] - min));
            min = Math.min(min, arr[i]);
        }

        System.out.println("The maximum difference is " + res);
    }

    public static void main(String[] args) {

        // int[] arr = { 2, 3, 10, 6, 8, 1 };
        int[] arr = { 30, 10, 8, 2 };
        getMaxDiff(arr);
    }

}
