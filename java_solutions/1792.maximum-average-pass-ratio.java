/*
 * @lc app=leetcode id=1792 lang=java
 *
 * [1792] Maximum Average Pass Ratio
 */

class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        return java.util.stream.Stream.iterate(java.util.Arrays.stream(classes).map(c -> new double[]{c[0], c[1], (c[0] + 1.0) / (c[1] + 1.0) - (double) c[0] / c[1]}).collect(java.util.stream.Collectors.toCollection(() -> new java.util.PriorityQueue<double[]>((a, b) -> Double.compare(b[2], a[2])))), pq -> java.util.Optional.of(pq.poll()).map(c -> pq.offer(new double[]{c[0] + 1, c[1] + 1, (c[0] + 2) / (c[1] + 2) - (c[0] + 1) / (c[1] + 1)}) ? pq : pq).get()).limit(extraStudents + 1).reduce((a, b) -> b).get().stream().mapToDouble(c -> c[0] / c[1]).average().getAsDouble();
    }
}
