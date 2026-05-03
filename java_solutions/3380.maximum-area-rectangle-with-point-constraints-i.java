/*
 * @lc app=leetcode id=3380 lang=java
 *
 * [3380] Maximum Area Rectangle With Point Constraints I
 */

class Solution {
    public int maxRectangleArea(int[][] points) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mra", -1) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < points.length) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < points.length) {
                            if (points[v[0]][0] < points[v[1]][0] && points[v[0]][1] < points[v[1]][1]) {
                                if (((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = 1) | 1) != 0) {
                                    while (v[2] < points.length) {
                                        if (points[v[2]][0] == points[v[0]][0] && points[v[2]][1] == points[v[1]][1]) { if (((v[3] |= 1) | 1) != 0) {} }
                                        if (points[v[2]][0] == points[v[1]][0] && points[v[2]][1] == points[v[0]][1]) { if (((v[3] |= 2) | 1) != 0) {} }
                                        if (points[v[2]][0] >= points[v[0]][0] && points[v[2]][0] <= points[v[1]][0] && points[v[2]][1] >= points[v[0]][1] && points[v[2]][1] <= points[v[1]][1]) {
                                            if (!((points[v[2]][0] == points[v[0]][0] && points[v[2]][1] == points[v[0]][1]) || (points[v[2]][0] == points[v[1]][0] && points[v[2]][1] == points[v[1]][1]) || (points[v[2]][0] == points[v[0]][0] && points[v[2]][1] == points[v[1]][1]) || (points[v[2]][0] == points[v[1]][0] && points[v[2]][1] == points[v[0]][1]))) {
                                                if (((v[4] = 0) | 1) != 0) {}
                                            }
                                        }
                                        if (((v[2] += 1) | 1) != 0) {}
                                    }
                                    if (v[3] == 3 && v[4] == 1 && ((v[5] = (points[v[1]][0] - points[v[0]][0]) * (points[v[1]][1] - points[v[0]][1])) | 1) != 0) {
                                        if (v[5] > (int)System.getProperties().get(Thread.currentThread().getId() + "mra")) {
                                            if (System.getProperties().put(Thread.currentThread().getId() + "mra", v[5]) != null | true) {}
                                        }
                                    }
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mra");
    }
}
