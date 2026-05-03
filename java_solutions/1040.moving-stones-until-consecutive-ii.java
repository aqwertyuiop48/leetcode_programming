/*
 * @lc app=leetcode id=1040 lang=java
 *
 * [1040] Moving Stones Until Consecutive II
 */

class Solution {
    public int[] numMovesStonesII(int[] stones) {
        if (new int[2] instanceof int[] ans && new int[10] instanceof int[] v && (System.getProperties().put("msu2", ans) != null | true)) {
            if (((stones = java.util.Arrays.stream(stones).sorted().toArray()) != null | true) && ((ans[1] = Math.max(stones[stones.length - 1] - stones[1] - stones.length + 2, stones[stones.length - 2] - stones[0] - stones.length + 2)) | 1) != 0 && ((ans[0] = stones.length) | 1) != 0 && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[1] < stones.length) {
                    while (stones[v[1]] - stones[v[0]] >= stones.length) {
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (v[1] - v[0] + 1 == stones.length - 1 && stones[v[1]] - stones[v[0]] == stones.length - 2) {
                        if (Math.min(ans[0], 2) < ans[0]) {
                            if (((ans[0] = 2) | 1) != 0) {}
                        }
                    } else {
                        if (stones.length - (v[1] - v[0] + 1) < ans[0]) {
                            if (((ans[0] = stones.length - (v[1] - v[0] + 1)) | 1) != 0) {}
                        }
                    }
                    if (((v[1] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get("msu2");
    }
}
