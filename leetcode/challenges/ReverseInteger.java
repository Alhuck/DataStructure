package diy.learnings.leetcode.challenges;

public class ReverseInteger {

    public static int reverse(int x) {

        int rev = 0;
        while (x != 0) {

            int pop = x % 10;
            x = x / 10;
            if (rev > Integer.MAX_VALUE / 10) // condition to avoid value overflow of integer
                return 0;
            if (rev < Integer.MIN_VALUE / 10) // condition to avoid value overflow of integer
                return 0;
            rev = rev * 10 + pop;
        }

        return rev;
        
        // bruteforce approach

        // if (x == 0) {
        // return x;
        // }
        //
        // String x1 = x + "";
        // String[] arr = x1.split("");
        // StringBuffer sb = new StringBuffer();
        // boolean negative = x >= 0 ? false : true;
        // for (int i = arr.length - 1; i >= 0; i--) {
        //
        // if (i == 0 && arr[i].equals("0") || arr[i].equals("-")) {
        // continue;
        // }
        // sb.append(arr[i]);
        // }
        //
        // if (negative) {
        // sb = new StringBuffer("-").append(sb);
        // }
        // return Integer.parseInt(new String(sb));
    }

//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        int x = -123123213;
//        System.out.println(reverse(x));
//    }

}
