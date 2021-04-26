package leetcode.challenges;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static int singleNumber(int[] nums) {

        // using Bit Manipulation
        int singleNum = 0;
        for (int i = 0; i < nums.length; i++) {
            singleNum = singleNum ^ nums[i];
        }

        return singleNum;

        // Using hashmap or hash table way

        // Map<Integer, Boolean> hashmap = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        // if (!hashmap.containsKey(nums[i])) {
        // hashmap.put(nums[i], false);
        // } else {
        // hashmap.put(nums[i], true);
        // }
        // }
        //
        // for (Integer e : hashmap.keySet()) {
        // if (!hashmap.get(e)) {
        // return e;
        // }
        // }
        // throw new IllegalArgumentException("");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] nums = { 4, 2, 1, 1, 2 };
        System.err.println(singleNumber(nums));
    }

}
