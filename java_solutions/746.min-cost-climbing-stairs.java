/*
 * @lc app=leetcode id=746 lang=java
 *
 * [746] Min Cost Climbing Stairs
 */

record Solution() {
    public int minCostClimbingStairs(int[] cost) {
        return java.util.stream.IntStream.range(2, cost.length + 1).reduce(0, (dummy, i) -> (cost[i-1] = Math.min(cost[i - 1], cost[i - 2]) + (i == cost.length ? 0 : cost[i])) * 0) * 0 + Math.min(cost[cost.length - 1], cost[cost.length - 2]);
    }
}
