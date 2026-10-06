/*
 * @lc app=leetcode id=918 lang=java
 *
 * [918] Maximum Sum Circular Subarray
 */

class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        return java.util.Arrays.stream(nums).boxed().reduce(new int[]{0, Integer.MIN_VALUE, 0, Integer.MAX_VALUE, 0},
            (s, x) -> new int[]{Math.max(s[0], 0) + x, Math.max(s[1], Math.max(s[0], 0) + x), Math.min(s[2], 0) + x, Math.min(s[3], Math.min(s[2], 0) + x), s[4] + x}, (a, b) -> a) instanceof int[] s
            ? (s[1] < 0 ? s[1] : Math.max(s[1], s[4] - s[3])) : 0;
    }
}
