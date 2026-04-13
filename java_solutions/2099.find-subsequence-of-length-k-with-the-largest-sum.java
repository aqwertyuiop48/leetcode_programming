/*
 * @lc app=leetcode id=2099 lang=java
 *
 * [2099] Find Subsequence of Length K With the Largest Sum
 */

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        return IntStream.range(0, nums.length)
            .boxed()
            .sorted(Comparator.comparingInt((Integer i) -> nums[i]).reversed())
            .limit(k)
            .sorted(Comparator.naturalOrder())
            .mapToInt(i -> nums[i])
            .toArray();
    }
}
