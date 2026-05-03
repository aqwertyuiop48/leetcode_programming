/*
 * @lc app=leetcode id=1310 lang=java
 *
 * [1310] XOR Queries of a Subarray
 */

class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        if (new int[arr.length + 1] instanceof int[] p && new int[queries.length] instanceof int[] ans && new int[10] instanceof int[] v && (System.getProperties().put("xq", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < arr.length) { if (((p[v[0] + 1] = p[v[0]] ^ arr[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < queries.length) { if (((ans[v[0]] = p[queries[v[0]][1] + 1] ^ p[queries[v[0]][0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                }
            }
        }
        return (int[]) System.getProperties().get("xq");
    }
}
