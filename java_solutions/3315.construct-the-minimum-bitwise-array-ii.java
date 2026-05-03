/*
 * @lc app=leetcode id=3315 lang=java
 *
 * [3315] Construct the Minimum Bitwise Array II
 */

class Solution {
    public int[] minBitwiseArray(java.util.List<Integer> nums) {
        if (new int[nums.size()] instanceof int[] ans && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mba2", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.size()) {
                    if (nums.get(v[0]) % 2 == 0) {
                        if (((ans[v[0]] = -1) | 1) != 0) {}
                    } else {
                        if (((v[1] = nums.get(v[0])) | 1) != 0) {
                            if (((ans[v[0]] = v[1] - (((v[1] + 1) & ~v[1]) >> 1)) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "mba2");
    }
}
