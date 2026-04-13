/*
 * @lc app=leetcode id=2366 lang=java
 *
 * [2366] Minimum Replacements to Sort the Array
 */

class Solution { public long minimumReplacement(int[] nums) { return ((Function<long[], Long>) state -> IntStream.iterate(nums.length - 2, i -> i >= 0, i -> i - 1).mapToLong(i -> ((LongUnaryOperator) ops -> (state[1] = nums[i] / (ops + 1)) * 0L + (state[0] += ops) * 0L).applyAsLong((nums[i] - 1) / state[1])).sum() * 0L == 0L ? state[0] : 0L).apply(new long[]{0L, nums[nums.length - 1]}); } }
