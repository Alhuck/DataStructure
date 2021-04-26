package gfg.recurssion;

public class RopeCuttingProblem {

    public static int ropeCut(int n, int a, int b, int c) {

        if (n == 0) {
            return 0;
        }

        if (n <= -1) {
            return -1;
        }

        int res = Math.max(ropeCut(n - a, a, b, c), 
                        Math.max(
                            ropeCut(n - b, a, b, c), ropeCut(n - c, a, b, c)));

        if (res == -1) {
            return -1;
        }
        return res + 1;
    }

    public static void main(String[] args) {

        System.out.println(ropeCut(23, 12, 9, 11));
    }

}
