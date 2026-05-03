/*
 * @lc app=leetcode id=3532 lang=java
 *
 * [3532] Path Existence Queries in a Graph I
 */

class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        if (new boolean[queries.length] instanceof boolean[] ans && new int[n] instanceof int[] comp && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "peq", ans) != null | true)) {
            if (((v[0] = 1) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((comp[0] = 0) | 1) != 0) {
                while (v[0] < n) {
                    if (nums[v[0]] - nums[v[0] - 1] > maxDiff) { if (((v[1] += 1) | 1) != 0) {} }
                    if (((comp[v[0]] = v[1]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < queries.length) {
                    if (((ans[v[0]] = comp[queries[v[0]][0]] == comp[queries[v[0]][1]]) | true) != false && ((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (boolean[]) System.getProperties().get(Thread.currentThread().getId() + "peq");
    }
}
