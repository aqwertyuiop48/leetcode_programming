/*
 * @lc app=leetcode id=3209 lang=java
 *
 * [3209] Number of Subarrays With AND Value of K
 */

class Solution { public long countSubarrays(int[] nums, int k) { return IntStream.range(0, nums.length).boxed().reduce(IntStream.range(0, 33).mapToLong(x -> x < 32 ? -1L : 0L).toArray(), (st, i) -> (nums[i] & k) != k ? ((st[31] = i) * 0 == 0 ? st : st) : ((IntFunction<long[]>) mz -> (mz > st[31] ? (st[32] += mz - st[31]) * 0 : 0) == 0 ? st : st).apply(IntStream.range(0, 31).reduce(i, (mz, j) -> ((nums[i] >>> j) & 1) == 0 ? (int)((st[j] = i) * 0 + mz) : (((k >>> j) & 1) == 0 ? Math.min(mz, (int)st[j]) : mz))), (a, b) -> a)[32]; } }
