/*
 * @lc app=leetcode id=995 lang=java
 *
 * [995] Minimum Number of K Consecutive Bit Flips
 */

class Solution {
    public int minKBitFlips(int[] nums, int k) {
        return Arrays.stream(new int[][]{new int[]{0}}).peek(res -> {
            if (new int[]{nums.length, 0, 0, 0} instanceof int[] v && new int[nums.length + 1] instanceof int[] flip) {
                while (v[1] < v[0]) {
                    if (((v[2] ^= flip[v[1]]) | 1) != 0) {
                        if (nums[v[1]] == v[2]) {
                            if (v[1] + k > v[0]) {
                                if (((res[0] = -1) | 1) != 0 && ((v[1] = v[0]) | 1) != 0) {}
                            } else {
                                if (((res[0] += 1) | 1) != 0 && ((v[2] ^= 1) | 1) != 0 && ((flip[v[1] + k] ^= 1) | 1) != 0) {}
                            }
                        }
                    }
                    if (((v[1] += 1) | 1) != 0) {}
                }
            }
        }).findFirst().orElse(null)[0];
    }
}
