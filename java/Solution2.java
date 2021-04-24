package diy.learnings.java;

public class Solution2 {

    static int findPrimeFactors(int n) {

        if (n <= 1) {
            return 1;
        }

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
                break;
            }
        }
        return findPrimeFactors(n);
    }

    public static void main(String[] args) {

        findPrimeFactors(330);
        String s = "s";
    }

}
