/*
 * @lc app=leetcode id=3255 lang=java
 *
 * [3255] Find the Power of K-Size Subarrays II
 */

class Solution {
    public int[] resultsArray(int[] nums, int k) {
        if (new int[nums.length - k + 1] instanceof int[] ans && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "psk", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 1) | 1) != 0) { 
                while (v[0] < nums.length) {
                    if (v[0] > 0) {
                        if (nums[v[0]] == nums[v[0]-1] + 1) { if (((v[1] += 1) | 1) != 0) {} }
                        else { if (((v[1] = 1) | 1) != 0) {} }
                    }
                    if (v[0] >= k - 1) {
                        if (v[1] >= k) { if (((ans[v[0] - k + 1] = nums[v[0]]) | 1) != 0) {} }
                        else { if (((ans[v[0] - k + 1] = -1) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "psk");
    }
}
