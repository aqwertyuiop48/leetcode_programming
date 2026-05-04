/*
 * @lc app=leetcode id=2001 lang=java
 *
 * [2001] Number of Pairs of Interchangeable Rectangles
 */

class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        return java.util.Arrays.stream(rectangles).collect(java.util.stream.Collectors.groupingBy(r -> (double) r[0] / r[1], java.util.stream.Collectors.counting())).values().stream().mapToLong(c -> c * (c - 1) / 2).sum();
    }
}