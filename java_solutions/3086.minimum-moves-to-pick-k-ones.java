/*
 * @lc app=leetcode id=3086 lang=java
 *
 * [3086] Minimum Moves to Pick K Ones
 */

class Solution { public long minimumMoves(int[] nums, int k, int maxChanges) { return ((Function<long[], Long>) A -> ((Function<Integer, Long>) n -> IntStream.rangeClosed(Math.max(0, k - maxChanges), Math.min(n, Math.min(Math.max(0, k - maxChanges) + 3, k))).mapToLong(l -> IntStream.rangeClosed(0, n - l).mapToLong(i -> A[i + l] - A[i + l - l / 2] - (A[i + l / 2] - A[i]) + (k - l) * 2L).min().orElse(Long.MAX_VALUE)).min().orElse(Long.MAX_VALUE)).apply(IntStream.range(0, nums.length).reduce(0, (count, i) -> nums[i] > 0 ? (int)((A[count + 1] = A[count] + i) * 0 + count + 1) : count))).apply(new long[nums.length + 1]); } }
