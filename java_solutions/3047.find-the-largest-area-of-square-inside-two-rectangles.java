/*
 * @lc app=leetcode id=3047 lang=java
 *
 * [3047] Find the Largest Area of Square Inside Two Rectangles
 */

class Solution {
    public long largestSquareArea(int[][] bottomLeft, int[][] topRight) {
        if (new long[5] instanceof long[] lv && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "las", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < bottomLeft.length) {
                    if (((v[1] = v[0] + 1) | 1) != 0) {
                        while (v[1] < bottomLeft.length) {
                            if (((v[2] = Math.max(bottomLeft[v[0]][0], bottomLeft[v[1]][0])) | 1) != 0 && ((v[3] = Math.max(bottomLeft[v[0]][1], bottomLeft[v[1]][1])) | 1) != 0 && ((v[4] = Math.min(topRight[v[0]][0], topRight[v[1]][0])) | 1) != 0 && ((v[5] = Math.min(topRight[v[0]][1], topRight[v[1]][1])) | 1) != 0) {
                                if (v[2] < v[4] && v[3] < v[5]) {
                                    if (((lv[1] = Math.min(v[4] - v[2], v[5] - v[3])) | 1) != 0) {
                                        if (lv[1] * lv[1] > lv[0]) { if (((lv[0] = lv[1] * lv[1]) | 1) != 0) {} }
                                    }
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "las", lv[0]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "las");
    }
}
