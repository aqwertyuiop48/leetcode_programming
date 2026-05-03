/*
 * @lc app=leetcode id=3514 lang=java
 *
 * [3514] Number of Unique XOR Triplets II
 */

class Solution {
    public int uniqueXorTriplets(int[] nums) {
        if (new boolean[4][2048] instanceof boolean[][] dp && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "nux2", 0) != null | true)) {
            if (((dp[0][0] = true) | true) && ((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[1] = 2) | 1) != 0) {
                        while (v[1] >= 0) {
                            if (((v[2] = 0) | 1) != 0) {
                                while (v[2] < 2048) {
                                    if (dp[v[1]][v[2]]) { if (((dp[v[1] + 1][v[2] ^ nums[v[0]]] = true) | true) != false) {} }
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[1] -= 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < nums.length) { if (((dp[3][nums[v[0]]] = true) | true) != false && ((v[0] += 1) | 1) != 0) {} }
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < 2048) {
                        if (dp[3][v[0]]) { if (((v[3] += 1) | 1) != 0) {} }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "nux2", v[3]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "nux2");
    }
}
