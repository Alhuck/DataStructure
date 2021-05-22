package BinaryTree;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

import javax.print.attribute.HashAttributeSet;

public class Solution {

    public static void getFreeTimeSlots(TreeMap<String, Integer> hm) {

        String time_period;
        for (int i = 0; i < 24; i++) {

            // if (i >= 12) {
            //
            // String time_period_pm = i+"PM-"+(i+1)+"PM";
            //
            // } else {
            // String time_period_am = i+"AM-"+(i+1)+"AM";
            //
            // }

            time_period = i + "-" + (i + 1);
            if (i + 1 == 24) {
                time_period = i + "-" + 0;
            }

            if (hm.containsKey(time_period)) {
                continue;
            } else {
                hm.put(time_period, 0);
            }
        }

        for (Entry<String, Integer> m : hm.entrySet()) {

            System.out.println(m.getKey() + ":" + m.getValue());
        }
    }

    public static void main(String[] args) {

        String[] time_slots = { "13-14", "13:30-14:30", "15-17", "15:30-16:30", "8:30-10:30" };

        TreeMap<String, Integer> hm = new TreeMap<>();
//        for (int i = 0; i < time_slots.length; i++) {
//            hm.put(time_slots[i], 1);
//        }

        getFreeTimeSlots(hm);
        
        
        // another approach

    }

}
