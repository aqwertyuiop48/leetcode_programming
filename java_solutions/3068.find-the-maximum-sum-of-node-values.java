/*
 * @lc app=leetcode id=3068 lang=java
 *
 * [3068] Find the Maximum Sum of Node Values
 */

class Solution { public long maximumValueSum(int[] nums, int k, int[][] edges) { return ((Function<long[], Long>) s -> IntStream.of(nums).reduce(0, (acc, x) -> (int)((s[0] += Math.max(x, x ^ k)) * 0L + (s[1] += (x ^ k) > x ? 1 : 0) * 0L + (s[2] = Math.min(s[2], Math.abs((long)x - (x ^ k)))) * 0L)) * 0 == 0 ? (s[1] % 2 == 0 ? s[0] : s[0] - s[2]) : 0L).apply(new long[]{0, 0, Integer.MAX_VALUE}); } }
