/*
 * @lc app=leetcode id=3111 lang=java
 *
 * [3111] Minimum Rectangles to Cover Points
 */

class Solution {
    public int minRectanglesToCoverPoints(int[][] points, int w) {
        if (new int[100005] instanceof int[] tmp && new int[256] instanceof int[] cnt && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mrt", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] <= 24) {
                    if (((v[1] = 0) | 1) != 0) { while (v[1] < 256) { if (((cnt[v[1]++] = 0) | 1) != 0) {} } }
                    if (((v[1] = 0) | 1) != 0) { while (v[1] < points.length) { if (((cnt[(points[v[1]++][0] >> v[0]) & 255] += 1) | 1) != 0) {} } }
                    if (((v[1] = 1) | 1) != 0) { while (v[1] < 256) { if (((cnt[v[1]] += cnt[v[1] - 1]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} } }
                    if (((v[1] = points.length - 1) | 1) != 0) {
                        while (v[1] >= 0) { if (((tmp[--cnt[(points[v[1]][0] >> v[0]) & 255]] = points[v[1]][0]) | 1) != 0 && ((v[1] -= 1) | 1) != 0) {} }
                    }
                    if (((v[1] = 0) | 1) != 0) { while (v[1] < points.length) { if (((points[v[1]][0] = tmp[v[1]]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} } }
                    if (((v[0] += 8) | 1) != 0) {}
                }
            }
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = -1) | 1) != 0) {
                while (v[0] < points.length) {
                    if (v[2] == -1 || points[v[0]][0] > v[2] + w) {
                        if (((v[1] += 1) | 1) != 0 && ((v[2] = points[v[0]][0]) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mrt", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mrt");
    }
}
