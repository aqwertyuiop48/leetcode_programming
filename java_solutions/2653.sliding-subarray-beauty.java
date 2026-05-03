/*
 * @lc app=leetcode id=2653 lang=java
 *
 * [2653] Sliding Subarray Beauty
 */

class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        if (new int[nums.length - k + 1] instanceof int[] ans && new int[105] instanceof int[] f && new int[10] instanceof int[] v && (System.getProperties().put("ssb", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((f[nums[v[0]] + 50] += 1) | 1) != 0) {}
                    if (v[0] >= k) { if (((f[nums[v[0] - k] + 50] -= 1) | 1) != 0) {} }
                    if (v[0] >= k - 1) {
                        if (((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                            while (v[1] < 50) {
                                if (((v[2] += f[v[1]]) | 1) != 0 && v[2] >= x) { if (((ans[v[0] - k + 1] = v[1] - 50) | 1) != 0 && ((v[1] = 100) | 1) != 0) {} }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get("ssb");
    }
}
