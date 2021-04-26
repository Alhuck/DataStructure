package leetcode.challenges;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueChar {

    public static int firstUniqChar(String s) {
        Map<String, Integer> hashMap = new LinkedHashMap<>();
        String[] charArr = s.split("");
        for (int i = 0; i < charArr.length; i++) {
            if (hashMap.containsKey(charArr[i])) {
                hashMap.put(charArr[i], (hashMap.get(charArr[i]) + 1));
                continue;
            }
            hashMap.put(charArr[i], 1);
        }

        for (int j = 0; j < charArr.length; j++) {
            if (hashMap.get(charArr[j]) == 1) {
                return j;
            }
            //break;
        }
        return -1;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println(firstUniqChar("loveleetcode"));
        
    }

}
