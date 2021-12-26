package leetcode.challenges.Year_2022;

import java.util.Arrays;

public class ZeroBasedPermutation {

    public static int[] outputArr_efficient(int[] nums) {

        int n = nums.length;
        // concept is to store two values in a single index of an array and then retrieve the value
        // formula = a = a + n*b
        // then 'a' original value can be retrieved by a%n
        // 'b' original value can be retrieved by a/n

        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] + n * (nums[nums[i]] % n);
        }

        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] / n;
        }

        return nums;
    }

    // naive or bruteforce solutions
    public static int[] outputArr(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] nums = { 0, 2, 1, 5, 3, 4 };
        int[] res = outputArr_efficient(nums);
        Arrays.stream(res)
            .forEach(e -> System.out.print(e + ", "));
    }

}
