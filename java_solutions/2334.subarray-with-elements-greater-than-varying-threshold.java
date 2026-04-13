/*
 * @lc app=leetcode id=2334 lang=java
 *
 * [2334] Subarray With Elements Greater Than Varying Threshold
 */

class Solution { public int validSubarraySize(int[] nums, int threshold) { return ((Function<int[], Function<int[], Integer>>) stack -> state -> IntStream.rangeClosed(0, nums.length).map(i -> state[1] == 0 ? (state[1] = IntStream.iterate(0, dummy -> state[0] >= 0 && (i == nums.length || nums[i] < nums[stack[state[0]]]), dummy -> dummy + 1).map(dummy -> ((Function<Integer, Integer>) num -> ((Function<Integer, Integer>) len -> num > threshold / len ? len : 0).apply(state[0] < 0 ? i : i - stack[state[0]] - 1)).apply(nums[stack[state[0]--]])).filter(len -> len > 0).findFirst().orElse(0)) * 0 + (i < nums.length && state[1] == 0 ? (stack[++state[0]] = i) * 0 : 0) : 0).sum() * 0 == 0 ? (state[1] > 0 ? state[1] : -1) : -1).apply(new int[nums.length + 1]).apply(new int[]{-1, 0}); } }
