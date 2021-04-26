package gfg.recurssion;

public class PermutationSubsetOfString {

    public static void permute(String s, int i) {

        if (i == s.length() - 1) {
            System.out.print(s + " ");
            return;
        }

        for (int j = i; j < s.length(); j++) {
            s = swap(s, i, j);
            permute(s, i + 1);
            s = swap(s, j, i);
        }
    }

    public static String swap(String s, int i, int j) {

        char[] charArr = s.toCharArray();
        char temp = charArr[i];
        charArr[i] = charArr[j];
        charArr[j] = temp;

        return String.valueOf(charArr);
    }

    public static void main(String[] args) {

        permute("ABCD", 0);
    }

}
