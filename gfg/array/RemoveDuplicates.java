package gfg.array;

import java.util.Arrays;

public class RemoveDuplicates {

    public static int remDupe(int[] arr) {

        int res = 1;
        for (int i = 1; i < arr.length; i++) {

            if (arr[res - 1] != arr[i]) {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr = { 8, 10, 15, 20, 20, 30, 30, 30, 30, 30 };
        for (int i = 0; i < remDupe(arr); i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
