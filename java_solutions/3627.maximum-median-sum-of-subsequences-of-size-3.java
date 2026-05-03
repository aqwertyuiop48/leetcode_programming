/*
 * @lc app=leetcode id=3627 lang=java
 *
 * [3627] Maximum Median Sum of Subsequences of Size 3
 */

class Solution {
    public long maximumMedianSum(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mms", 0L) != null | true) && (nums = java.util.Arrays.stream(nums).sorted().toArray()) != null && ((v[0] = nums.length - 2) | 1) != 0 && ((v[1] = 0) | 1) != 0 && new long[1] instanceof long[] ans) {
            while (v[1] < nums.length / 3) {
                if (((ans[0] += nums[v[0]]) | 1) != 0 && ((v[0] -= 2) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "mms", ans[0]) != null | true) {}
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mms");
    }
}
