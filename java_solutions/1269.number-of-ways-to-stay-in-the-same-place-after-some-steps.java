/*
 * @lc app=leetcode id=1269 lang=java
 *
 * [1269] Number of Ways to Stay in the Same Place After Some Steps
 */

class Solution {
    public int numWays(int steps, int arrLen) {
        return Arrays.stream(new int[][]{new int[]{0}}).peek(res -> {
            if (new int[]{steps, Math.min(steps / 2 + 1, arrLen), 0, 0, 0} instanceof int[] v && new int[Math.min(steps / 2 + 1, arrLen) + 2] instanceof int[] cur && new int[Math.min(steps / 2 + 1, arrLen) + 2] instanceof int[] next && new int[1][] instanceof int[][] temp) {
                if (((cur[1] = 1) | 1) != 0) {
                    while (v[0] > 0) {
                        if (((v[2] = 1) | 1) != 0) {
                            while (v[2] <= v[1]) {
                                if (((next[v[2]] = (int)(((long)cur[v[2]] + cur[v[2] - 1] + cur[v[2] + 1]) % 1000000007)) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                            }
                        }
                        if (((temp[0] = cur) != null) && ((cur = next) != null) && ((next = temp[0]) != null) && ((v[0] -= 1) | 1) != 0) {}
                    }
                }
                if (((res[0] = cur[1]) | 1) != 0) {}
            }
        }).findFirst().orElse(null)[0];
    }
}
