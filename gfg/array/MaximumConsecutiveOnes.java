package gfg.array;

public class MaximumConsecutiveOnes {

    public static int getMaxConsecOnes(int[] arr) {

        int count = 0;
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                res = Math.max(res, count);
            } else {
                count = 0;
            }
        }

        return res;
    }

    public static void main(String[] args) {

//        int[] arr = { 0, 1, 1, 0, 1, 0 };
//        int[] arr = { 1, 1, 1, 1 };
        int[] arr = {1, 0, 1, 1, 1, 1, 0, 1, 1};
        System.out.println("The maximum consective ones in the array are : " + getMaxConsecOnes(arr));
    }

}
