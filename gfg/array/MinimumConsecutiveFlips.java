package gfg.array;

public class MinimumConsecutiveFlips {

    public static void getMinimumConsecutiveFlips(int[] arr) {

        // ideas is: if array's first element and last element are same, 
        // then second different element group needs to be flipped
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                if (arr[i] != arr[0]) { // start of the flipping ele group is checked with array's first element 
                    System.out.print("From " + i + " to ");
                } else {
                    System.out.print(i - 1);
                    System.out.println();
                }
            }
        }

        // when the first and last element of the array are different,
        // the for loop above will print the start of element group 
        // end will be printed here!
        if (arr[arr.length - 1] != arr[0]) {
            System.out.print(arr.length - 1);
        }
    }

    public static void main(String[] args) {

        // int[] arr = { 1, 1, 0, 0, 0, 1 };
        int[] arr = { 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1 };
        getMinimumConsecutiveFlips(arr);
    }

}
