/*
 * @lc app=leetcode id=2903 lang=java
 *
 * [2903] Find Indices With Index and Value Difference I
 */

class Solution {
    public int[] findIndices(int[] nums, int indexDiff, int valueDiff) {
        if (new int[]{-1, -1} instanceof int[] ans && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "fi", ans) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[2] = 1) | 1) != 0) {
            while (v[0] < nums.length && v[2] == 1) {
                if (((v[1] = v[0] + indexDiff) | 1) != 0) {
                    while (v[1] < nums.length && v[2] == 1) {
                        if (Math.abs(nums[v[0]] - nums[v[1]]) >= valueDiff) {
                            if (((ans[0] = v[0]) | 1) != 0 && ((ans[1] = v[1]) | 1) != 0 && ((v[2] = 0) | 1) != 0) {}
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "fi");
    }
}
