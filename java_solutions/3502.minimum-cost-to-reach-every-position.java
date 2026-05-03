/*
 * @lc app=leetcode id=3502 lang=java
 *
 * [3502] Minimum Cost to Reach Every Position
 */

class Solution {
    public int[] minCosts(int[] cost) {
        if (new int[cost.length] instanceof int[] ans && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mcre", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 2000000000) | 1) != 0) {
                while (v[0] < cost.length) {
                    if (cost[v[0]] < v[1]) { if (((v[1] = cost[v[0]]) | 1) != 0) {} }
                    if (((ans[v[0]] = v[1]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "mcre");
    }
}
