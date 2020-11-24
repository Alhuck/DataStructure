package diy.learnings.leetcode.challenges;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {

        if (x < 0)
            return false; // all negative # are not Palindrome
        if (x != 0 && x % 10 == 0)
            return false; // number ending with zero can't be a Palindrome unless the number 'x' itself zero

        int rev = 0;
        while (x > rev) { // checking only half of the given integer x and then directly compare the remaining part of the 'x' for Palindrome

            rev = rev * 10 + x % 10;
            x = x / 10;
        }

        // condition to check half of the 'reversed' no with the rest of the no 'x', because in order to be palindrome reversed numbers / 10 has to be equal with x
        // in order to over come integer with odd numbers like '12321', finding the 'reverse' number divison by 10 rev / 10 and checking with 'x' helps
        if (x == rev || x == rev / 10)
            return true;

        return false;

        // my bruteforce approach
        // if (x < 0)
        // return false;
        //
        // long rev = 0;
        // long checkX = x;
        // while (checkX != 0) {
        //
        // long pop = checkX % 10;
        // checkX = checkX / 10;
        //
        // rev = rev * 10 + pop;
        // }
        //
        // if (rev == x)
        // return true;
        //
        // return false;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int x = 1221;
        System.out.println(isPalindrome(x));
    }

}
