/*
 * @lc app=leetcode id=1846 lang=java
 *
 * [1846] Maximum Element After Decreasing and Rearranging
 */

class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        return java.util.Arrays.stream(arr).sorted().reduce(0, (max, a) -> Math.min(max + 1, a));
    }
}
