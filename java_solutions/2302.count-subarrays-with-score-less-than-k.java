/*
 * @lc app=leetcode id=2302 lang=java
 *
 * [2302] Count Subarrays With Score Less Than K
 */

class Solution { public long countSubarrays(int[] nums, long k) { return ((Function<long[], Long>) state -> IntStream.range(0, nums.length).mapToLong(r -> (state[0] += nums[r]) * 0L + IntStream.iterate(0, d -> state[0] * (r - state[1] + 1) >= k, d -> d).mapToLong(d -> (state[0] -= nums[(int)state[1]++]) * 0L).sum() * 0L + (state[2] += r - state[1] + 1)).sum() * 0L == 0L ? state[2] : 0L).apply(new long[3]); } }
