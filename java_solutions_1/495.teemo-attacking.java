/*
 * @lc app=leetcode id=495 lang=java
 *
 * [495] Teemo Attacking
 */

class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        return timeSeries.length == 0 ? 0 : java.util.stream.IntStream.range(0, timeSeries.length - 1).map(i -> Math.min(timeSeries[i + 1] - timeSeries[i], duration)).sum() + duration;
    }
}
