/*
 * @lc app=leetcode id=3036 lang=java
 *
 * [3036] Number of Subarrays That Match a Pattern II
 */

class Solution { public int countMatchingSubarrays(int[] nums, int[] pattern) { return ((Function<int[], Integer>) dp -> ((Function<int[], Integer>) table -> ((Function<int[], Integer>) state -> IntStream.range(0, dp.length).map(i -> (state[1] = IntStream.iterate(state[1], x -> table[x - 1]).filter(x -> x == 0 || dp[i] == pattern[x]).findFirst().orElse(0)) * 0 + (dp[i] == pattern[state[1]] ? ++state[1] : 0) * 0 + (state[1] == pattern.length ? (state[0]++ * 0 + (state[1] = table[state[1] - 1]) * 0) : 0)).sum() * 0 == 0 ? state[0] : 0).apply(new int[2])).apply(((Function<int[], int[]>) table -> ((Function<int[], int[]>) j -> IntStream.range(1, pattern.length).map(i -> (j[0] = IntStream.iterate(j[0], x -> table[x - 1]).filter(x -> x == 0 || pattern[i] == pattern[x]).findFirst().orElse(0)) * 0 + (pattern[i] == pattern[j[0]] ? ++j[0] : 0) * 0 + (table[i] = j[0])).sum() * 0 == 0 ? table : table).apply(new int[1])).apply(new int[pattern.length]))).apply(IntStream.range(0, nums.length - 1).map(i -> Integer.compare(nums[i + 1], nums[i])).toArray()); } }
