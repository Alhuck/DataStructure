package gfg.array;

import java.util.Arrays;

public class ZerosToEnd {

    int x;

    public static int[] moveZeroesToEnd(int[] arr) {

        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == 0) {
        // int j = i;
        // int temp = arr[j];
        //
        // while (j < arr.length - 1) {
        // arr[j] = arr[j + 1];
        // j++;
        // }
        // arr[arr.length - 1] = temp;
        // }
        // }

        int pointer = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[pointer];
                arr[pointer] = temp;
                pointer++;
            }

        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = { 8, 5, 0, 10, 0, 0, 0 };
        Arrays.stream(moveZeroesToEnd(arr))
            .forEach(ele -> System.out.print(ele + " "));

    }

}
