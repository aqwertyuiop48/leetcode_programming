/*
 * @lc app=leetcode id=1870 lang=java
 *
 * [1870] Minimum Speed to Arrive on Time
 */

class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        return dist.length - 1 >= hour ? -1 : java.util.stream.Stream.iterate(new int[]{1, 10000000}, b -> java.util.stream.IntStream.range(0, dist.length).mapToDouble(i -> i == dist.length - 1 ? (double) dist[i] / (b[0] + (b[1] - b[0]) / 2) : Math.ceil((double) dist[i] / (b[0] + (b[1] - b[0]) / 2))).sum() <= hour ? new int[]{b[0], b[0] + (b[1] - b[0]) / 2} : new int[]{b[0] + (b[1] - b[0]) / 2 + 1, b[1]}).filter(b -> b[0] >= b[1]).findFirst().get()[0];
    }
}
