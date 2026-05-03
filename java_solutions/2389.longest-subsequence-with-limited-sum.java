/*
 * @lc app=leetcode id=2389 lang=java
 *
 * [2389] Longest Subsequence With Limited Sum
 */

class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        if (new int[queries.length] instanceof int[] ans && (nums = java.util.Arrays.stream(nums).sorted().toArray()) != null && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "aq", ans) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < queries.length) {
                if (((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                    while (v[1] < nums.length && v[2] + nums[v[1]] <= queries[v[0]]) { if (((v[2] += nums[v[1]]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} }
                    if (((ans[v[0]] = v[1]) | 1) != 0) {}
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "aq");
    }
}
