/*
 * @lc app=leetcode id=1779 lang=java
 *
 * [1779] Find Nearest Point That Has the Same X or Y Coordinate
 */

class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        return IntStream.range(0, points.length)
            .filter(i -> points[i][0] == x || points[i][1] == y)
            .boxed()
            .min(Comparator.comparingInt(i -> Math.abs(x - points[i][0]) + Math.abs(y - points[i][1])))
            .orElse(-1);
    }
}
