/*
 * @lc app=leetcode id=334 lang=java
 *
 * [334] Increasing Triplet Subsequence
 */

class Solution {
    public boolean increasingTriplet(int[] nums) {
        return java.util.Arrays.stream(nums).boxed().reduce(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, 0}, (a, n) -> n <= a[0] ? new int[]{n, a[1], a[2]} : n <= a[1] ? new int[]{a[0], n, a[2]} : new int[]{a[0], a[1], 1}, (a, b) -> a)[2] == 1;
    }
}
