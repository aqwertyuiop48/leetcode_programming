/*
 * @lc app=leetcode id=2285 lang=java
 *
 * [2285] Maximum Total Importance of Roads
 */

class Solution {
    public long maximumImportance(int n, int[][] roads) {
        if (new long[n] instanceof long[] deg && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mti", 0L) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < roads.length) {
                if (((deg[roads[v[0]][0]] += 1) | 1) != 0 && ((deg[roads[v[0]][1]] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
            }
            if ((deg = java.util.Arrays.stream(deg).sorted().toArray()) != null && ((v[0] = 0) | 1) != 0 && new long[1] instanceof long[] ans) {
                while (v[0] < n) { if (((ans[0] += deg[v[0]] * (v[0] + 1)) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                if (System.getProperties().put(Thread.currentThread().getId() + "mti", ans[0]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mti");
    }
}
