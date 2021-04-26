package gfg.array;

public class SecondLargestElement {

    public static int getSecondLargestElement(int[] arr) {

        int large = 0;
        int small = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[large] < arr[i]) {
                small = large;
                large = i;
            } else if (arr[small] < arr[i]) {
                small = i;
            }
        }

        if (large == small) {
            return -1;
        }

        return small;
    }

    public static void main(String[] args) {

        int[] arr = { 10, 10, 10 };
        System.out.println("Smallest element is : " + getSecondLargestElement(arr));

    }

}
