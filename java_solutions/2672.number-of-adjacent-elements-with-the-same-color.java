/*
 * @lc app=leetcode id=2672 lang=java
 *
 * [2672] Number of Adjacent Elements With the Same Color
 */

class Solution {
    public int[] colorTheArray(int n, int[][] queries) {
        if (new int[queries.length] instanceof int[] ans && new int[n] instanceof int[] c && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ca", ans) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
            while (v[0] < queries.length) {
                if (c[queries[v[0]][0]] != 0) {
                    if (queries[v[0]][0] > 0 && c[queries[v[0]][0] - 1] == c[queries[v[0]][0]]) { if (((v[1] -= 1) | 1) != 0) {} }
                    if (queries[v[0]][0] < n - 1 && c[queries[v[0]][0] + 1] == c[queries[v[0]][0]]) { if (((v[1] -= 1) | 1) != 0) {} }
                }
                if (((c[queries[v[0]][0]] = queries[v[0]][1]) | 1) != 0) {}
                if (queries[v[0]][0] > 0 && c[queries[v[0]][0] - 1] == c[queries[v[0]][0]]) { if (((v[1] += 1) | 1) != 0) {} }
                if (queries[v[0]][0] < n - 1 && c[queries[v[0]][0] + 1] == c[queries[v[0]][0]]) { if (((v[1] += 1) | 1) != 0) {} }
                if (((ans[v[0]] = v[1]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "ca");
    }
}
