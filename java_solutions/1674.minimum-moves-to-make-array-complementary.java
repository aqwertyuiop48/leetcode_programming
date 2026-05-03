/*
 * @lc app=leetcode id=1674 lang=java
 *
 * [1674] Minimum Moves to Make Array Complementary
 */

class Solution {
    public int minMoves(int[] nums, int limit) {
        if (new int[limit * 2 + 2] instanceof int[] d && new int[10] instanceof int[] v && (System.getProperties().put("mmc", 2000000000) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[3] = nums.length) | 1) != 0) {
                while (v[0] < v[3] / 2) {
                    if (((v[1] = Math.min(nums[v[0]], nums[v[3] - 1 - v[0]])) | 1) != 0 && ((v[2] = Math.max(nums[v[0]], nums[v[3] - 1 - v[0]])) | 1) != 0) {
                        if (((d[2] += 2) | 1) != 0 && ((d[v[1] + 1] -= 1) | 1) != 0 && ((d[v[1] + v[2]] -= 1) | 1) != 0 && ((d[v[1] + v[2] + 1] += 1) | 1) != 0 && ((d[v[2] + limit + 1] += 1) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 2) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                    while (v[0] <= limit * 2) {
                        if (((v[4] += d[v[0]]) | 1) != 0 && v[4] < (int)System.getProperties().get("mmc")) { if (System.getProperties().put("mmc", v[4]) != null | true) {} }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get("mmc");
    }
}
