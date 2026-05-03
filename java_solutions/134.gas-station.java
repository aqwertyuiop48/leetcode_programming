/*
 * @lc app=leetcode id=134 lang=java
 *
 * [134] Gas Station
 */

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        return java.util.stream.IntStream.range(0, gas.length).boxed().reduce(new int[]{0, 0, 0}, (s, i) -> new int[]{s[0] + gas[i] - cost[i], s[1] + gas[i] - cost[i] < 0 ? 0 : s[1] + gas[i] - cost[i], s[1] + gas[i] - cost[i] < 0 ? i + 1 : s[2]}, (a, b) -> a)[0] >= 0 ? java.util.stream.IntStream.range(0, gas.length).boxed().reduce(new int[]{0, 0, 0}, (s, i) -> new int[]{s[0] + gas[i] - cost[i], s[1] + gas[i] - cost[i] < 0 ? 0 : s[1] + gas[i] - cost[i], s[1] + gas[i] - cost[i] < 0 ? i + 1 : s[2]}, (a, b) -> a)[2] : -1;
    }
}
