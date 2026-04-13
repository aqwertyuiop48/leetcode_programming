/*
 * @lc app=leetcode id=2552 lang=java
 *
 * [2552] Count Increasing Quadruplets
 */

class Solution { public long countQuadruplets(int[] nums) { return ((Function<long[], Function<long[], Long>>) ans -> cnt -> IntStream.range(0, nums.length).mapToLong(j -> ((Function<long[], Long>) ps -> IntStream.range(0, j).mapToLong(i -> nums[j] > nums[i] ? (ps[0]++ * 0L + (ans[0] += cnt[i]) * 0L) : nums[j] < nums[i] ? (cnt[i] += ps[0]) * 0L : 0L).sum() * 0L).apply(new long[1])).sum() * 0L == 0L ? ans[0] : 0L).apply(new long[1]).apply(new long[nums.length]); } }
