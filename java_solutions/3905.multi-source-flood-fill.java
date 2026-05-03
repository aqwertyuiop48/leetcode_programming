/*
 * @lc app=leetcode id=3905 lang=java
 *
 * [3905] Multi Source Flood Fill
 */

class Solution {
    public int[][] colorGrid(int n, int m, int[][] sources) {
        if (new int[n][m] instanceof int[][] ans && new int[n][m] instanceof int[][] time && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "cg", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < n) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < m) { if (((time[v[0]][v[1]++] = 2000000000) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if ((sources = java.util.Arrays.stream(sources).sorted((a, b) -> Integer.compare(b[2], a[2])).toArray(int[][]::new)) != null && new int[n * m * 2 + 10] instanceof int[] q && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[0] = 0) | 1) != 0) {
                while (v[0] < sources.length) {
                    if (time[sources[v[0]][0]][sources[v[0]][1]] == 2000000000) {
                        if (((ans[sources[v[0]][0]][sources[v[0]][1]] = sources[v[0]][2]) | 1) != 0 && ((time[sources[v[0]][0]][sources[v[0]][1]] = 0) | 1) != 0 && ((q[v[3]++] = sources[v[0]][0]) | 1) != 0 && ((q[v[3]++] = sources[v[0]][1]) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (new int[]{-1, 0, 1, 0, -1} instanceof int[] dirs) {
                    while (v[2] < v[3]) {
                        if (((v[4] = q[v[2]++]) | 1) != 0 && ((v[5] = q[v[2]++]) | 1) != 0 && ((v[6] = 0) | 1) != 0) {
                            while (v[6] < 4) {
                                if (((v[7] = v[4] + dirs[v[6]]) | 1) != 0 && ((v[8] = v[5] + dirs[v[6] + 1]) | 1) != 0) {
                                    if (v[7] >= 0 && v[7] < n && v[8] >= 0 && v[8] < m && time[v[7]][v[8]] == 2000000000) {
                                        if (((time[v[7]][v[8]] = time[v[4]][v[5]] + 1) | 1) != 0 && ((ans[v[7]][v[8]] = ans[v[4]][v[5]]) | 1) != 0 && ((q[v[3]++] = v[7]) | 1) != 0 && ((q[v[3]++] = v[8]) | 1) != 0) {}
                                    }
                                }
                                if (((v[6] += 1) | 1) != 0) {}
                            }
                        }
                    }
                }
            }
        }
        return (int[][]) System.getProperties().get(Thread.currentThread().getId() + "cg");
    }
}
