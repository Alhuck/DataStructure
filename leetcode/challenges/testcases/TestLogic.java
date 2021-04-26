//package leetcode.challenges.testcases;
//
//import static org.junit.Assert.assertArrayEquals;
//import static org.junit.Assert.assertTrue;
//
//import java.util.Arrays;
//
//import org.junit.Test;
//
//import diy.learnings.leetcode.challenges.ReturnSumOf1DArray;
//import diy.learnings.leetcode.challenges.ReverseString;
//
//public class TestLogic {
//
//    @Test
//    public void test1DArray() {
//        int[] results = { 1, 2, 3, 4 };
//        int[] nums = { 1, 1, 1, 1 };
//        assertArrayEquals(results, ReturnSumOf1DArray.soultion(nums));
//    }
//
//    @Test
//    public void testReverseString() {
//        char[] expected = { 's', 'k', 'e', 'e', 'g' };
//        char[] actual = { 'g', 'e', 'e', 'k', 's' };
//        ReverseString.reverseString(actual, 0, actual.length - 1);
//        assertTrue(Arrays.equals(expected, actual));
//    }
//
//}
