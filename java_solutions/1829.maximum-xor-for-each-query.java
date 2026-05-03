/*
 * @lc app=leetcode id=1829 lang=java
 *
 * [1829] Maximum XOR for Each Query
 */

class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        if (new int[nums.length] instanceof int[] ans && new int[10] instanceof int[] v && (System.getProperties().put("mxq", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = (1 << maximumBit) - 1) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[1] ^= nums[v[0]]) | 1) != 0 && ((ans[nums.length - 1 - v[0]] = v[1] ^ v[2]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get("mxq");
    }
}
