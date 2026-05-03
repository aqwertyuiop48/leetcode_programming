/*
 * @lc app=leetcode id=3025 lang=java
 *
 * [3025] Find the Number of Ways to Place People I
 */

class Solution {
    public int numberOfPairs(int[][] points) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "nop", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < points.length) {
                    if (((v[1] = v[0] + 1) | 1) != 0) {
                        while (v[1] < points.length) {
                            if (points[v[0]][0] > points[v[1]][0] || (points[v[0]][0] == points[v[1]][0] && points[v[0]][1] < points[v[1]][1])) {
                                if (((v[2] = points[v[0]][0]) | 1) != 0 && ((v[3] = points[v[0]][1]) | 1) != 0 && ((points[v[0]][0] = points[v[1]][0]) | 1) != 0 && ((points[v[0]][1] = points[v[1]][1]) | 1) != 0 && ((points[v[1]][0] = v[2]) | 1) != 0 && ((points[v[1]][1] = v[3]) | 1) != 0) {}
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                    while (v[0] < points.length) {
                        if (((v[5] = -2147483648) | 1) != 0 && ((v[1] = v[0] + 1) | 1) != 0) {
                            while (v[1] < points.length) {
                                if (points[v[1]][1] <= points[v[0]][1]) {
                                    if (points[v[1]][1] > v[5]) {
                                        if (((v[4] += 1) | 1) != 0 && ((v[5] = points[v[1]][1]) | 1) != 0) {}
                                    }
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "nop", v[4]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "nop");
    }
}
