package gfg.recurssion;

public class TowerOfHanoiUsingRecurrsion {

    public static void TOH(int n, char A, char B, char C) {

        if (n == 1) { // I made mistake in the base case
            System.out.println("Move 1 from " + A + " to " + C);
            return; // I forgot to add the return here and it caused stackoverflow exception
        }

        TOH(n - 1, A, C, B);
        System.out.println("Move " + n + " from " + A + " to " + C);
        TOH(n - 1, B, A, C);
    }

    public static void main(String[] args) {

        TOH(3, 'A', 'B', 'C');
    }

}
