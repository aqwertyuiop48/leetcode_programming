/*
 * @lc app=leetcode id=908 lang=java
 *
 * [908] Smallest Range I
 */

class Solution {
    public int smallestRangeI(int[] nums, int k) {
        return java.util.Arrays.stream(nums).summaryStatistics() instanceof java.util.IntSummaryStatistics st ? Math.max(0, st.getMax() - st.getMin() - 2 * k) : 0;
    }
}
