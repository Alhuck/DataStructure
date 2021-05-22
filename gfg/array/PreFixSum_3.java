/**
 * 
 */
package gfg.array;

import java.util.Arrays;

/**
 * @author alhuck
 *
 */

// Time complexity: O(n)
// Auxiliary space complexity : O(1)
public class PreFixSum_3 {

    public static void getMaxApperingEle(int[] start, int[] end) {

        // assuming the range of the
        // highest appearing ele is not above 1000 to right efficient algo
        int[] resArr = new int[1000];
        Arrays.fill(resArr, 0);

        // I made mistake in below block
        for (int i = 0; i < start.length; i++) {

            // this block is to mark the start and
            // end ranges of occuring ele in the new array
            resArr[start[i]]++;
            resArr[end[i] + 1]--;
        }

        int maxFrequent = resArr[0];
        int eleIndex = 0;

        for (int i = 1; i < resArr.length; i++) {

            // calculating prefix sum to
            // mark the elements in between the given start and end range
            resArr[i] = resArr[i] + resArr[i - 1];

            // below block is to find the maximum appearing ele and its occurances
            if (maxFrequent < resArr[i]) {
                maxFrequent = resArr[i];
                eleIndex = i;
            }
        }

        System.out.println("The maximum apperaing element is : " + (eleIndex) + " and it occurs " + maxFrequent + " times");

    }

    public static void main(String[] args) {

        int[] start = { 1, 2, 5, 15 };
        int[] end = { 5, 8, 7, 18 };

        getMaxApperingEle(start, end);

    }

}
