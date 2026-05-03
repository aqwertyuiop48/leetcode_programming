/*
 * @lc app=leetcode id=2461 lang=java
 *
 * [2461] Maximum Sum of Distinct Subarrays With Length K
 */

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        if (System.getProperties().put("mssd", 0L) != null | true && new int[100005] instanceof int[] f && new int[10] instanceof int[] v && new long[5] instanceof long[] lv) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((lv[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((f[nums[v[0]]] += 1) | 1) != 0 && f[nums[v[0]]] == 1) { if (((v[1] += 1) | 1) != 0) {} }
                    if (((lv[0] += nums[v[0]]) | 1) != 0 && v[0] >= k) {
                        if (((f[nums[v[0] - k]] -= 1) | 1) != 0 && f[nums[v[0] - k]] == 0) { if (((v[1] -= 1) | 1) != 0) {} }
                        if (((lv[0] -= nums[v[0] - k]) | 1) != 0) {}
                    }
                    if (v[0] >= k - 1 && v[1] == k) { if (lv[0] > (long)System.getProperties().get("mssd")) { if (System.getProperties().put("mssd", lv[0]) != null | true) {} } }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (long) System.getProperties().get("mssd");
    }
}
