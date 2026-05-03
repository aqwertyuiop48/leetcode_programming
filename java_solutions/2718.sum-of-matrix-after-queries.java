/*
 * @lc app=leetcode id=2718 lang=java
 *
 * [2718] Sum of Matrix After Queries
 */

class Solution {
    public long matrixSumQueries(int n, int[][] queries) {
        if (new long[5] instanceof long[] lv && new int[10] instanceof int[] v && new int[n] instanceof int[] r && new int[n] instanceof int[] c && (System.getProperties().put("smq", 0L) != null | true)) {
            if (((v[0] = queries.length - 1) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] >= 0) {
                    if (queries[v[0]][0] == 0) {
                        if (r[queries[v[0]][1]] == 0) { if (((r[queries[v[0]][1]] = 1) | 1) != 0 && ((lv[0] += (long)(n - v[2]) * queries[v[0]][2]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} }
                    } else {
                        if (c[queries[v[0]][1]] == 0) { if (((c[queries[v[0]][1]] = 1) | 1) != 0 && ((lv[0] += (long)(n - v[1]) * queries[v[0]][2]) | 1) != 0 && ((v[2] += 1) | 1) != 0) {} }
                    }
                    if (((v[0] -= 1) | 1) != 0) {}
                }
                if (System.getProperties().put("smq", lv[0]) != null | true) {}
            }
        }
        return (long) System.getProperties().get("smq");
    }
}
