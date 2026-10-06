/*
 * @lc app=leetcode id=983 lang=java
 *
 * [983] Minimum Cost For Tickets
 */

class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        return new int[366] instanceof int[] dp && java.util.Arrays.stream(days).boxed().collect(java.util.stream.Collectors.toSet()) instanceof java.util.Set<Integer> st
            && java.util.stream.IntStream.rangeClosed(1, 365).peek(d -> dp[d] = !st.contains(d) ? dp[d - 1]
                : Math.min(dp[d - 1] + costs[0], Math.min(dp[Math.max(0, d - 7)] + costs[1], dp[Math.max(0, d - 30)] + costs[2]))).allMatch(x -> true)
            ? dp[365] : 0;
    }
}
