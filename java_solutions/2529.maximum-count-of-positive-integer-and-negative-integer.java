/*
 * @lc app=leetcode id=2529 lang=java
 *
 * [2529] Maximum Count of Positive Integer and Negative Integer
 */

class Solution {
    public int maximumCount(int[] nums) {
        return (int) Math.max(
            Arrays.stream(nums).filter(n -> n < 0).count(), 
            Arrays.stream(nums).filter(n -> n > 0).count()
        );
    }
}
