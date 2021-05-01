package gfg.array;

import java.util.Arrays;

public class ReverseArray {

    public static int[] reverArray(int[] arr) {

        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = { 12, 8, 15, 3, 5, 7, 2, 9 };
        Arrays.stream(reverArray(arr))
            .forEach(ele -> System.out.print(ele + " "));

    }

}
