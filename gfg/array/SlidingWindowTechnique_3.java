package gfg.array;

import java.util.Arrays;

public class SlidingWindowTechnique_3 {

    public static void printNbonacciArray(int n, int m) {

        int[] nbonacciArr = new int[m];
        Arrays.fill(nbonacciArr, 0);

        nbonacciArr[n] = 1;
        nbonacciArr[n - 1] = 1;

        for (int i = n + 1; i < m; i++) {
            // formula to calculate the sum of 'n' numbers
            nbonacciArr[i] = 2 * nbonacciArr[i - 1] - nbonacciArr[i - n - 1];
        }

        Arrays.stream(nbonacciArr)
            .forEach(ele -> System.out.print(ele + " "));

    }

    public static void main(String[] args) {

        int n = 4;
        int m = 10;

        printNbonacciArray(n, m);
    }

}
