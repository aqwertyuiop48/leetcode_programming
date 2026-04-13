/*
 * @lc app=leetcode id=514 lang=java
 *
 * [514] Freedom Trail
 */

class Solution {
    public int findRotateSteps(String ring, String key) {
        if (new Object[]{new int[key.length() + 1][ring.length()], new int[10]} instanceof Object[] o && o[0] instanceof int[][] dp && o[1] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "frs", 0) != null | true)) {
            if (((v[0] = key.length() - 1) | 1) != 0) {
                while (v[0] >= 0) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < ring.length()) {
                            if (((dp[v[0]][v[1]] = 999999) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                                while (v[2] < ring.length()) {
                                    if (ring.charAt(v[2]) == key.charAt(v[0])) {
                                        if (((v[3] = Math.abs(v[1] - v[2])) | 1) != 0) {}
                                        if (ring.length() - v[3] < v[3]) { if (((v[3] = ring.length() - v[3]) | 1) != 0) {} }
                                        if (v[3] + 1 + dp[v[0] + 1][v[2]] < dp[v[0]][v[1]]) {
                                            if (((dp[v[0]][v[1]] = v[3] + 1 + dp[v[0] + 1][v[2]]) | 1) != 0) {}
                                        }
                                    }
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] -= 1) | 1) != 0) {}
                }
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "frs", dp[0][0]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "frs");
    }
}
