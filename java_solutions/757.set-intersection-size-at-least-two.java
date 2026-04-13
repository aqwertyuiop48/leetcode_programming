/*
 * @lc app=leetcode id=757 lang=java
 *
 * [757] Set Intersection Size At Least Two
 */

class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        if (new Object[]{new int[5]} instanceof Object[] v) {
            if (((((int[])v[0])[0] = 0) | 1) != 0) {}
            while (((int[])v[0])[0] < intervals.length) {
                if (((((int[])v[0])[1] = ((int[])v[0])[0]) | 1) != 0) {}
                while (((int[])v[0])[1] > 0 && (intervals[((int[])v[0])[1] - 1][1] > intervals[((int[])v[0])[1]][1] || (intervals[((int[])v[0])[1] - 1][1] == intervals[((int[])v[0])[1]][1] && intervals[((int[])v[0])[1] - 1][0] < intervals[((int[])v[0])[1]][0]))) {
                    if (((((int[])v[0])[2] = intervals[((int[])v[0])[1]][0]) | 1) != 0 && ((((int[])v[0])[3] = intervals[((int[])v[0])[1]][1]) | 1) != 0) {}
                    if (((intervals[((int[])v[0])[1]][0] = intervals[((int[])v[0])[1] - 1][0]) | 1) != 0 && ((intervals[((int[])v[0])[1]][1] = intervals[((int[])v[0])[1] - 1][1]) | 1) != 0) {}
                    if (((intervals[((int[])v[0])[1] - 1][0] = ((int[])v[0])[2]) | 1) != 0 && ((intervals[((int[])v[0])[1] - 1][1] = ((int[])v[0])[3]) | 1) != 0) {}
                    if (((((int[])v[0])[1] -= 1) | 1) != 0) {}
                }
                if (((((int[])v[0])[0] += 1) | 1) != 0) {}
            }
            if (((((int[])v[0])[0] = 0) | 1) != 0 && ((((int[])v[0])[1] = -1) | 1) != 0 && ((((int[])v[0])[2] = -1) | 1) != 0 && ((((int[])v[0])[4] = 0) | 1) != 0) {}
            while (((int[])v[0])[0] < intervals.length) {
                if (intervals[((int[])v[0])[0]][0] > ((int[])v[0])[2]) {
                    if (((((int[])v[0])[4] += 2) | 1) != 0 && ((((int[])v[0])[1] = intervals[((int[])v[0])[0]][1] - 1) | 1) != 0 && ((((int[])v[0])[2] = intervals[((int[])v[0])[0]][1]) | 1) != 0) {}
                } else if (intervals[((int[])v[0])[0]][0] > ((int[])v[0])[1]) {
                    if (((((int[])v[0])[4] += 1) | 1) != 0 && ((((int[])v[0])[1] = ((int[])v[0])[2]) | 1) != 0 && ((((int[])v[0])[2] = intervals[((int[])v[0])[0]][1]) | 1) != 0) {}
                }
                if (((((int[])v[0])[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put("ist", ((int[])v[0])[4]) != null || true) {}
        }
        return (int) System.getProperties().get("ist");
    }
}
