/*
 * @lc app=leetcode id=447 lang=java
 *
 * [447] Number of Boomerangs
 */

class Solution {
    public int numberOfBoomerangs(int[][] points) {
        return java.util.Arrays.stream(points).mapToInt(p -> java.util.Arrays.stream(points)
            .collect(java.util.stream.Collectors.groupingBy(q -> (p[0] - q[0]) * (p[0] - q[0]) + (p[1] - q[1]) * (p[1] - q[1]), java.util.stream.Collectors.counting()))
            .values().stream().mapToInt(c -> (int) (c * (c - 1))).sum()).sum();
    }
}
