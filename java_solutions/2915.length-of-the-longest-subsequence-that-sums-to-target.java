/*
 * @lc app=leetcode id=2915 lang=java
 *
 * [2915] Length of the Longest Subsequence That Sums to Target
 */

class Solution {
    public int lengthOfLongestSubsequence(java.util.List<Integer> nums, int target) {
        if (java.util.stream.IntStream.generate(() -> -1000000).limit(target + 1).toArray() instanceof int[] dp && (System.getProperties().put(Thread.currentThread().getId() + "ll", -1) != null | true) && ((dp[0] = 0) | 1) != 0 && new int[10] instanceof int[] v && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums.size()) {
                if (((v[1] = target) | 1) != 0) {
                    while (v[1] >= nums.get(v[0])) {
                        if (dp[v[1] - nums.get(v[0])] + 1 > dp[v[1]]) { if (((dp[v[1]] = dp[v[1] - nums.get(v[0])] + 1) | 1) != 0) {} }
                        if (((v[1] -= 1) | 1) != 0) {}
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "ll", dp[target] > 0 ? dp[target] : -1) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "ll");
    }
}
