package gfg.array;

// Time Complexity: O(n)
public class MajorityElement {

    public static int getMajorityElementIndex(int[] arr) {

        int index = 0; // max occuring ele index
        int count = 1;

        // this block is to find the index of the majority element
        for (int i = 1; i < arr.length; i++) {

            if (arr[index] == arr[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                index = i;
                count = 1;
            }
        }

        // below code is to check whether the element came more than n/2 times, to consider it as majority element of the array
        int total_occurance = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[index] == arr[i]) {
                total_occurance++;
            }
        }

        if (total_occurance > (arr.length / 2)) {
            return index;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        int[] arr = { 8, 7, 6, 8, 6, 6, 6, 6 };
        System.out.println(getMajorityElementIndex(arr));

    }

}
