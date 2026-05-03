/*
 * @lc app=leetcode id=2682 lang=java
 *
 * [2682] Find the Losers of the Circular Game
 */

class Solution {
    public int[] circularGameLosers(int n, int k) {
        if (new boolean[n] instanceof boolean[] vis && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "cgl", new int[0]) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 1) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
            while (!vis[v[0]]) {
                if (((vis[v[0]] = true) | true) && ((v[2] += 1) | 1) != 0 && ((v[0] = (v[0] + v[1] * k) % n) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
            }
            if (new int[n - v[2]] instanceof int[] ans && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < n) {
                    if (!vis[v[0]]) { if (((ans[v[1]++] = v[0] + 1) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "cgl", ans) != null | true) {}
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "cgl");
    }
}
