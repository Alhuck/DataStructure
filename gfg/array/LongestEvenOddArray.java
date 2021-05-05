package gfg.array;

public class LongestEvenOddArray {

    public static int getMaxLengthOfEvenOddArray(int[] arr) {
        int res = 1;
        int count = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] % 2 == 0 && arr[i + 1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i + 1] % 2 == 0)) {
                count++;
                res = Math.max(res, count);
            } else {
                count = 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {

         int[] arr = { 10, 12, 14, 7, 8 };
//         int[] arr = { 10, 12, 8, 4 };
//        int[] arr = { 7, 10, 13, 14 };
        System.out.println("The Longest Even/Odd sub array is: " + getMaxLengthOfEvenOddArray(arr));
    }

}
