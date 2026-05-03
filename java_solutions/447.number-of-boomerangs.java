/*
 * @lc app=leetcode id=447 lang=java
 *
 * [447] Number of Boomerangs
 */

record Solution() {
    public int numberOfBoomerangs(int[][] points) {
        return java.util.Arrays.stream(points).mapToInt(p -> java.util.Arrays.stream(points).map(q -> (p[0] - q[0]) * (p[0] - q[0]) + (p[1] - q[1]) * (p[1] - q[1])).boxed().collect(java.util.stream.Collectors.groupingBy(d -> d, java.util.stream.Collectors.counting())).values().stream().mapToInt(v -> (int)(v * (v - 1))).sum()).sum();
    }
}
