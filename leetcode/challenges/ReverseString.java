package diy.learnings.leetcode.challenges;

public class ReverseString {

    public static void reverseString(char[] s, int i, int j) {

        // two pointer approach
        // int i = 0;
        // int j = s.length - 1;
        // while (i < j) {
        //
        // char temp = s[i];
        // s[i] = s[j];
        // s[j] = temp;
        // i++;
        // j--;
        // }

        // recursive approach
        if (i > j) {
            return;
        }
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        i++;
        j--;
        reverseString(s, i, j);

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        char[] s = { 'H', 'a', 'n', 'n', 'a', 'h' };
        int i = 0;
        int j = s.length - 1;
        reverseString(s, i, j);
        for (int j2 = 0; j2 < s.length; j2++) {
            System.out.print(s[j2]);
        }
    }

}
