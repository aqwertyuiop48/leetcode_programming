/*
 * @lc app=leetcode id=945 lang=java
 *
 * [945] Minimum Increment to Make Array Unique
 */

class Solution {
    public int minIncrementForUnique(int[] nums) {
        return (int) (java.util.Arrays.stream(nums).sorted().boxed().reduce(new long[]{-1L, 0}, (s, x) -> new long[]{Math.max(x, s[0] + 1), s[1] + Math.max(x, s[0] + 1) - x}, (a, b) -> a)[1]);
    }
}
