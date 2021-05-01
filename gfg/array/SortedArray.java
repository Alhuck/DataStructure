package gfg.array;

public class SortedArray {

    public static boolean isArrSorted(int[] arr) {
        boolean res = true;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i - 1] > arr[i]) {
                res = false;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr = {12, 8, 15};
        System.out.println(isArrSorted(arr));
    }

}
