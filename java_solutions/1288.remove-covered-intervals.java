/*
 * @lc app=leetcode id=1288 lang=java
 *
 * [1288] Remove Covered Intervals
 */

class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        return java.util.Optional.of(new int[2])
            .filter(state -> java.util.Arrays.stream(intervals)
                .sorted((a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0])
                .allMatch(curr -> curr[1] > state[1] ? (state[1] = curr[1]) >= 0 && ++state[0] > 0 : true))
            .map(state -> state[0])
            .orElse(0);
    }
}
