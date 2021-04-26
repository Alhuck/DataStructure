package leetcode.challenges;

import java.util.Arrays;

public class ReturnSumOf1DArray {

    public static int[] soultion(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i-1];
        }

        return nums;
    }

//    public static void main(String[] args) {
//
//        int[] nums = {1,2,3,4,5};
//        Arrays.stream(soultion(nums)).forEach(e -> System.out.print(e + " "));
//    }
}
