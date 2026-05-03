/*
 * @lc app=leetcode id=2747 lang=java
 *
 * [2747] Count Zero Request Servers
 */

class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        if (new int[queries.length] instanceof int[] ans && new int[10] instanceof int[] v && (System.getProperties().put("czs", ans) != null | true)) {
            if (new Object[]{java.util.Arrays.stream(logs).sorted((a, b) -> a[1] - b[1]).toArray(int[][]::new)} instanceof Object[] o && o[0] instanceof int[][] l && new int[queries.length][2] instanceof int[][] q && ((v[0] = 0) | 1) != 0) {
                while (v[0] < queries.length) { if (((q[v[0]][0] = queries[v[0]]) | 1) != 0 && ((q[v[0]][1] = v[0]++) | 1) != 0) {} }
                if (new Object[]{java.util.Arrays.stream(q).sorted((a, b) -> a[0] - b[0]).toArray(int[][]::new)} instanceof Object[] qo && qo[0] instanceof int[][] sq && new int[n + 5] instanceof int[] count && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                    while (v[0] < sq.length) {
                        while (v[2] < l.length && l[v[2]][1] <= sq[v[0]][0]) { if (((count[l[v[2]][0]] += 1) | 1) != 0 && count[l[v[2]][0]] == 1) { if (((v[1] += 1) | 1) != 0) {} } if (((v[2] += 1) | 1) != 0) {} }
                        while (v[3] < l.length && l[v[3]][1] < sq[v[0]][0] - x) { if (((count[l[v[3]][0]] -= 1) | 1) != 0 && count[l[v[3]][0]] == 0) { if (((v[1] -= 1) | 1) != 0) {} } if (((v[3] += 1) | 1) != 0) {} }
                        if (((ans[sq[v[0]][1]] = n - v[1]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (int[]) System.getProperties().get("czs");
    }
}
