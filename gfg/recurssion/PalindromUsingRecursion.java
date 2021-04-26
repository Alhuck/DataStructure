package gfg.recurssion;

public class PalindromUsingRecursion {

    public static boolean isPalindrom(String s, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (s.charAt(start) == s.charAt(end)) {
            start++;
            end--;
            return isPalindrom(s, start, end);
        }
        return false;
    }

    public static void main(String[] args) {

        String s = "ABABAC";
        boolean isPalinString = isPalindrom(s, 0, s.length() - 1);
        System.out.println("The given string is Palindrome, true or false :" + isPalinString);

    }

}
