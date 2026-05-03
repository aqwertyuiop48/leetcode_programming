/*
 * @lc app=leetcode id=1749 lang=java
 *
 * [1749] Maximum Absolute Sum of Any Subarray
 */

class Solution {
    public int maxAbsoluteSum(int[] nums) {
        return java.util.stream.IntStream.of(nums).boxed().reduce(new int[]{0, 0, 0}, (a, x) -> new int[]{a[0] + x, Math.max(a[1], a[0] + x), Math.min(a[2], a[0] + x)}, (a, b) -> a)[1] - java.util.stream.IntStream.of(nums).boxed().reduce(new int[]{0, 0, 0}, (a, x) -> new int[]{a[0] + x, Math.max(a[1], a[0] + x), Math.min(a[2], a[0] + x)}, (a, b) -> a)[2];
    }
}
