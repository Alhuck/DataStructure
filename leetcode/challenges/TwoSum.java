package leetcode.challenges;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] {i, map.get(complement)};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("Check again!!!");
    }

    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 9;
        
        int[] output = twoSum(nums, target);
        if(output.length != 0) {
            System.out.println(output[0] + "," + output[1] );
        }
        
        

    }

}
