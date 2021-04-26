package gfg.recurssion;

public class JospesusProblem {

    public static int jos(int n, int k) {

        if (n == 1) { // I made a mistake in the base case 
            return 0;
        }

        return (jos(n - 1, k) + k) % n;
    }

    public static void main(String[] args) {

        System.out.println("Alive person # is : " + jos(6, 2));

        // if instead of circle starting with 0, if it starts with 1, then simply add 1 to the result

        System.out.println("Alive person # is : " + (jos(6, 2) + 1));
    }

}
