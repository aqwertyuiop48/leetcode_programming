/*
 * @lc app=leetcode id=2741 lang=java
 *
 * [2741] Special Permutations
 */

class Solution {
    public int specialPerm(int[] nums) {
        if (new int[1 << nums.length][nums.length] instanceof int[][] dp && new int[10] instanceof int[] v && (System.getProperties().put("sp", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[3] = 1000000007) | 1) != 0) {
                while (v[0] < nums.length) { if (((dp[1 << v[0]][v[0]++] = 1) | 1) != 0) {} }
                if (((v[0] = 1) | 1) != 0) {
                    while (v[0] < (1 << nums.length)) {
                        if (((v[1] = 0) | 1) != 0) {
                            while (v[1] < nums.length) {
                                if ((v[0] & (1 << v[1])) != 0 && dp[v[0]][v[1]] > 0) {
                                    if (((v[2] = 0) | 1) != 0) {
                                        while (v[2] < nums.length) {
                                            if ((v[0] & (1 << v[2])) == 0 && (nums[v[1]] % nums[v[2]] == 0 || nums[v[2]] % nums[v[1]] == 0)) {
                                                if (((dp[v[0] | (1 << v[2])][v[2]] = (dp[v[0] | (1 << v[2])][v[2]] + dp[v[0]][v[1]]) % v[3]) | 1) != 0) {}
                                            }
                                            if (((v[2] += 1) | 1) != 0) {}
                                        }
                                    }
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
                if (((v[0] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                    while (v[0] < nums.length) { if (((v[4] = (v[4] + dp[(1 << nums.length) - 1][v[0]++]) % v[3]) | 1) != 0) {} }
                    if (System.getProperties().put("sp", v[4]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get("sp");
    }
}
