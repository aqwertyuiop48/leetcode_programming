/*
 * @lc app=leetcode id=2070 lang=java
 *
 * [2070] Most Beautiful Item for Each Query
 */

class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        if (new int[queries.length] instanceof int[] ans && new int[10] instanceof int[] v && (System.getProperties().put("mbi", ans) != null | true)) {
            if (new Object[]{java.util.Arrays.stream(items).sorted((a, b) -> a[0] - b[0]).toArray(int[][]::new)} instanceof Object[] o && o[0] instanceof int[][] s) {
                if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                    while (v[0] < s.length) {
                        if (s[v[0]][1] > v[1]) { if (((v[1] = s[v[0]][1]) | 1) != 0) {} }
                        else { if (((s[v[0]][1] = v[1]) | 1) != 0) {} }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (((v[0] = 0) | 1) != 0) {
                        while (v[0] < queries.length) {
                            if (((v[2] = 0) | 1) != 0 && ((v[3] = s.length - 1) | 1) != 0 && ((v[5] = 0) | 1) != 0) {
                                while (v[2] <= v[3]) {
                                    if (((v[4] = v[2] + (v[3] - v[2]) / 2) | 1) != 0) {
                                        if (s[v[4]][0] <= queries[v[0]]) { if (((v[5] = s[v[4]][1]) | 1) != 0 && ((v[2] = v[4] + 1) | 1) != 0) {} }
                                        else { if (((v[3] = v[4] - 1) | 1) != 0) {} }
                                    }
                                }
                                if (((ans[v[0]] = v[5]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                            }
                        }
                    }
                }
            }
        }
        return (int[]) System.getProperties().get("mbi");
    }
}
