package gfg.array;

import java.util.Arrays;

public class LeftRotateElementByD {

    public static int[] rotateElements(int[] arr, int d) {

        reverseArr(arr, 0, d - 1);
        reverseArr(arr, d, arr.length - 1);
        reverseArr(arr, 0, arr.length - 1);

        return arr;
    }

    public static void reverseArr(int[] arr, int low, int high) {

        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int d = 3;
        Arrays.stream(rotateElements(arr, d))
            .forEach(ele -> System.out.print(ele + " "));

    }

}
