package leetcode.challenges;

import java.util.Arrays;

public class MergeSortedArrays {

    static int[] mergeArray(int[] A, int[] B, int m, int n) {

        // !-- bruteforce solution --!

        // if (m == 0)
        // return B;
        // if (n == 0)
        // return A;
        //
        // int i = 0;
        // int j = 0;
        //
        // while (i < m && j < n) {
        // if (A[i] <= B[j]) {
        // A[i] = A[i++];
        // } else {
        // int temp = A[i];
        // A[i] = B[j];
        // B[j] = temp;
        // ++i;
        // }
        // }
        //
        // while (j < n) {
        // A[i] = B[j];
        // j++;
        // i++;
        // }

        // !-- Efficient Solution --!
        int pos = m + n - 1;
        m--;
        n--;
        while (m >= 0 || n >= 0) {

            if (n < 0 || (m >= 0 && A[m] > B[n])) {
                A[pos--] = A[m--];
            } else {
                A[pos--] = B[n--];
            }
        }
        return A;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] A = { 4, 5, 6, 0, 0, 0 };
        int[] B = { 1, 2, 3 };
        int m = 3;
        int n = 3;
        Arrays.stream(mergeArray(A, B, m, n))
            .forEach(e -> System.out.println(e));
    }

}
