/*
 * @lc app=leetcode id=939 lang=java
 *
 * [939] Minimum Area Rectangle
 */

class Solution {
    public int minAreaRect(int[][] points) {
        return java.util.Arrays.stream(points).map(p -> p[0] * 40001 + p[1]).collect(java.util.stream.Collectors.toSet()) instanceof java.util.Set<Integer> s
            ? java.util.stream.IntStream.range(0, points.length).flatMap(i -> java.util.stream.IntStream.range(i + 1, points.length)
                .filter(j -> points[i][0] != points[j][0] && points[i][1] != points[j][1] && s.contains(points[i][0] * 40001 + points[j][1]) && s.contains(points[j][0] * 40001 + points[i][1]))
                .map(j -> Math.abs(points[i][0] - points[j][0]) * Math.abs(points[i][1] - points[j][1]))).min().orElse(0)
            : 0;
    }
}
