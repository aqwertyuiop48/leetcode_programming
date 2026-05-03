/*
 * @lc app=leetcode id=1266 lang=java
 *
 * [1266] Minimum Time Visiting All Points
 */

class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("mtv", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < points.length - 1) {
                    if (System.getProperties().put("mtv", (int)System.getProperties().get("mtv") + Math.max(Math.abs(points[v[0] + 1][0] - points[v[0]][0]), Math.abs(points[v[0] + 1][1] - points[v[0]][1]))) != null | true && ((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get("mtv");
    }
}
