package gfg.recurssion;

public class SubsetChallenge {

    public static void generateSubset(String s, String current, int i) {

        if (i == s.length()) {
            System.out.print(current + " ");
            return;
        }

        generateSubset(s, current, i + 1);
        generateSubset(s, current + s.charAt(i), i + 1);
    }

    public static void main(String[] args) {

        generateSubset("ABC", " ", 0);
    }

}
