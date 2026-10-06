/*
 * @lc app=leetcode id=746 lang=java
 *
 * [746] Min Cost Climbing Stairs
 */

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        return java.util.Arrays.stream(cost).boxed().reduce(new int[2], (s, c) -> new int[]{s[1], Math.min(s[0], s[1]) + c}, (a, b) -> a) instanceof int[] r ? Math.min(r[0], r[1]) : 0;
    }
}
