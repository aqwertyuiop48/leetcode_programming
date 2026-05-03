/*
 * @lc app=leetcode id=2438 lang=java
 *
 * [2438] Range Product Queries of Powers
 */

class Solution {
    public int[] productQueries(int n, int[][] queries) {
        if (new int[queries.length] instanceof int[] ans && new int[40] instanceof int[] p && new int[10] instanceof int[] v && (System.getProperties().put("rpq", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < 31) {
                    if ((n & (1 << v[0])) != 0) { if (((p[v[1]++] = (1 << v[0])) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < queries.length) {
                        if (((v[2] = queries[v[0]][0]) | 1) != 0 && ((v[3] = 1) | 1) != 0) {
                            while (v[2] <= queries[v[0]][1]) {
                                if (((v[3] = (int)(((long)v[3] * p[v[2]++]) % 1000000007)) | 1) != 0) {}
                            }
                            if (((ans[v[0]] = v[3]) | 1) != 0) {}
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (int[]) System.getProperties().get("rpq");
    }
}
