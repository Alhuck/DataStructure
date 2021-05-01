package gfg.array;

public class FrequencyOfSortedArr {

    public static void printFreqOfArr(int[] arr) {

        int count = 1;
        int val = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (val == arr[i]) {
                count++;
                continue;
            } else {
                System.out.println(val + " : " + count);
                val = arr[i];
                count = 1;
            }
        }

        System.out.println(val + " : " + count);

    }

    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30};
        printFreqOfArr(arr);

    }

}
