package gfg.searching;

// Time complexity: O(log (square root (number))
// space complexity: O(1)
public class SquareRoot {

    public static int getSquareRootOfNumber(int number) {

        int low = 0;
        int high = number;
        int res = -1;

        // idea is : simple binary search and
        // keep tracking of mid when there is no perfect square for the given number
        while (low <= high) {
            int mid = (low + high) / 2;
            int square = mid * mid;
            if (square == number) {
                return mid;
            } else if (square > number) {
                high = mid - 1;
            } else {
                low = mid + 1;
                res = mid; // I made a mistake here

            }
        }

        return res;
    }

    public static void main(String[] args) {

        int number = 14;
        System.out.println("The square root of the given number :" + getSquareRootOfNumber(number));
    }

}
