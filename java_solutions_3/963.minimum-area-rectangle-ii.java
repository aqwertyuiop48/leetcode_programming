/*
 * @lc app=leetcode id=963 lang=java
 *
 * [963] Minimum Area Rectangle II
 */

class Solution {
    public double minAreaFreeRect(int[][] points) {
        return java.util.Arrays.stream(points).map(p -> (p[0] + 100000L) * 400000L + p[1] + 100000L).collect(java.util.stream.Collectors.toSet()) instanceof java.util.Set<Long> s
            ? (double) java.util.stream.IntStream.range(0, points.length * points.length * points.length)
                .mapToObj(t -> new int[][]{points[t / points.length / points.length], points[t / points.length % points.length], points[t % points.length]})
                .filter(q -> q[0] != q[1] && q[0] != q[2] && (q[1][0] - q[0][0]) * (q[2][0] - q[0][0]) + (q[1][1] - q[0][1]) * (q[2][1] - q[0][1]) == 0
                    && (q[1][0] < q[2][0] || q[1][0] == q[2][0] && q[1][1] < q[2][1])
                    && s.contains((q[1][0] + q[2][0] - q[0][0] + 100000L) * 400000L + q[1][1] + q[2][1] - q[0][1] + 100000L))
                .mapToLong(q -> Math.abs((long) (q[1][0] - q[0][0]) * (q[2][1] - q[0][1]) - (long) (q[1][1] - q[0][1]) * (q[2][0] - q[0][0]))).min().orElse(0)
            : 0;
    }
}
