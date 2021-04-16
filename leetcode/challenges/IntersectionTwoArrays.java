package diy.learnings.leetcode.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionTwoArrays {

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> hm1 = new HashMap<>();
        Map<Integer, Integer> hm2 = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            if (hm1.containsKey(nums1[i])) {
                hm1.put(nums1[i], hm1.get(nums1[i]) + 1);
                continue;
            }
            hm1.put(nums1[i], 1);
        }

        for (int j = 0; j < nums2.length; j++) {
            if (hm2.containsKey(nums2[j])) {
                hm2.put(nums2[j], hm2.get(nums2[j]) + 1);
                continue;
            }
            hm2.put(nums2[j], 1);
        }
        List<Integer> commonList = new ArrayList<>();
        for (Integer key : hm1.keySet()) {
            if (hm2.containsKey(key)) {
                if (hm1.get(key) <= hm2.get(key)) {
                    int count1 = hm1.get(key);
                    while(count1 !=0) {
                        commonList.add(key);
                        count1--;
                    }
                } else {
                    int count2 = hm2.get(key);
                    while(count2 !=0) {
                        commonList.add(key);
                        count2--;
                    }
                }
            }
        }

        int[] commonArr = new int[commonList.size()];
        for(int i = 0; i< commonList.size(); i++) {
            commonArr[i] = commonList.get(i);
        }
        return commonArr;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums1 = { 4, 9, 5 };
        int[] nums2 = { 9, 4, 9, 8, 4 };
        intersect(nums1, nums2);
    }

}
