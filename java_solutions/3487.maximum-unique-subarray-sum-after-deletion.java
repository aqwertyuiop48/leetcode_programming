/*
 * @lc app=leetcode id=3487 lang=java
 *
 * [3487] Maximum Unique Subarray Sum After Deletion
 */

class Solution {
    public int maxSum(int[] nums) {
        if (new java.util.HashSet<Integer>() instanceof java.util.HashSet set && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mus", -1000000000) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = -1000000000) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (nums[v[0]] > v[2]) { if (((v[2] = nums[v[0]]) | 1) != 0) {} }
                    if (nums[v[0]] > 0 && set.add(nums[v[0]])) {
                        if (((v[1] += nums[v[0]]) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mus", v[2] <= 0 ? v[2] : v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mus");
    }
}
