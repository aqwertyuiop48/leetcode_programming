/*
 * @lc app=leetcode id=452 lang=java
 *
 * [452] Minimum Number of Arrows to Burst Balloons
 */

class Solution {
    public int findMinArrowShots(int[][] points) {
        return points.length == 0 ? 0 : java.util.stream.Stream.of(0).peek(_v -> java.util.Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]))).map(_v -> java.util.Arrays.stream(points).skip(1).reduce(new Object[]{points[0][1], 1}, (state, next) -> next[0] > (int) state[0] ? new Object[]{next[1], (int) state[1] + 1} : state, (a, b) -> b)[1]).map(res -> (int) res).findFirst().get();
    }
}
