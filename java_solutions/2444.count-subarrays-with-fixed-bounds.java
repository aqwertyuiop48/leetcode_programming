/*
 * @lc app=leetcode id=2444 lang=java
 *
 * [2444] Count Subarrays With Fixed Bounds
 */

class Solution { public long countSubarrays(int[] nums, int minK, int maxK) { return ((Function<int[], Long>) (state -> IntStream.range(0, nums.length).mapToLong(i -> (nums[i] < minK || nums[i] > maxK ? (state[0] = i) : 0) * 0L + (nums[i] == minK ? (state[1] = i) : 0) * 0L + (nums[i] == maxK ? (state[2] = i) : 0) * 0L + Math.max(0, Math.min(state[1], state[2]) - state[0])).sum())).apply(new int[]{-1, -1, -1}); } }
