/*
 * @lc app=leetcode id=673 lang=java
 *
 * [673] Number of Longest Increasing Subsequence
 */

class Solution {
    public int findNumberOfLIS(int[] nums) {
        return new int[nums.length] instanceof int[] len && new int[nums.length] instanceof int[] cnt
            && java.util.stream.IntStream.range(0, nums.length).peek(i -> java.util.stream.IntStream.of(java.util.stream.IntStream.range(0, i).filter(j -> nums[j] < nums[i]).map(j -> len[j]).max().orElse(0))
                .forEach(m -> cnt[i] = (len[i] = m + 1) > 1 ? java.util.stream.IntStream.range(0, i).filter(j -> nums[j] < nums[i] && len[j] == m).map(j -> cnt[j]).sum() : 1)).allMatch(x -> true)
            ? java.util.stream.IntStream.range(0, nums.length).filter(i -> len[i] == java.util.Arrays.stream(len).max().getAsInt()).map(i -> cnt[i]).sum() : 0;
    }
}
