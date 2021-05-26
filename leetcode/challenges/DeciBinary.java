package leetcode.challenges;

// Time Complexity : O(L) where L is length of string
// Space Complexity: O(1)
public class DeciBinary {

    // To find the max digit in the given string because,
    // since deci-binary is only 0, 
    // 1 it will take max digit number of 1's  added to reach that number
    public static int getMinPartitions(String n) {

        int res = 0;

        for (int i = 0; i < n.length(); i++) {
            res = Math.max(res, n.charAt(i) - '0');
        }

        return res;

        // int x = Integer.parseInt(n);
        // List<Integer> al = new ArrayList<>();
        //
        // for (int i = 1; i < x; i++) {
        //
        // String s = String.valueOf(i);
        // String[] arr = s.split("");
        // int j = 0;
        // boolean isDB = false;
        // while (j < arr.length) {
        //
        // if (arr[j].equals("1") || arr[j].equals("0")) {
        // isDB = true;
        // } else {
        // isDB = false;
        // break;
        // }
        // j++;
        // }
        // if (isDB) {
        // al.add(i);
        // }
        // }
        //
        // for (int i = 0; i < al.size(); i++) {
        // System.out.print(al.get(i) + " ");
        // }
    }

    public static void main(String[] args) {

        // String n = "32";
        // String n = "82734";
        String n = "27346209830709182346";

        System.out.println(getMinPartitions(n));
    }

}
