/*
 * @lc app=leetcode id=3238 lang=java
 *
 * [3238] Find the Number of Winning Players
 */

class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        if (new int[n][11] instanceof int[][] cnt && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "wpc", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < pick.length) {
                    if (((cnt[pick[v[0]][0]][pick[v[0]][1]] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < n) {
                        if (((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                            while (v[1] <= 10 && v[2] == 0) {
                                if (cnt[v[0]][v[1]] > v[0]) {
                                    if (((v[3] += 1) | 1) != 0 && ((v[2] = 1) | 1) != 0) {}
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "wpc", v[3]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "wpc");
    }
}
