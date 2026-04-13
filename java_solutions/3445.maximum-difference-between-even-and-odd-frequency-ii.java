/*
 * @lc app=leetcode id=3445 lang=java
 *
 * [3445] Maximum Difference Between Even and Odd Frequency II
 */

class Solution { public int maxDifference(String s, int k) { return Optional.of(new int[]{Integer.MIN_VALUE}).map(ans -> IntStream.range(0, 25).filter(p -> p / 5 != p % 5).map(p -> Optional.of(new int[]{0, 0, 0, 0, -1, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE}).map(local -> IntStream.range(0, s.length()).map(right -> (local[0] += s.charAt(right) == (char)('0' + p / 5) ? 1 : 0) * 0 + (local[1] += s.charAt(right) == (char)('0' + p % 5) ? 1 : 0) * 0 + (int)IntStream.iterate(0, d -> right - local[4] >= k && local[1] - local[3] >= 2, d -> (local[5 + (((local[2] & 1) << 1) | (local[3] & 1))] = Math.min(local[5 + (((local[2] & 1) << 1) | (local[3] & 1))], local[2] - local[3])) * 0 + (++local[4]) * 0 + (local[2] += s.charAt(local[4]) == (char)('0' + p / 5) ? 1 : 0) * 0 + (local[3] += s.charAt(local[4]) == (char)('0' + p % 5) ? 1 : 0) * 0).count() * 0 + (local[5 + ((((local[0] & 1) << 1) | (local[1] & 1)) ^ 2)] != Integer.MAX_VALUE ? (ans[0] = Math.max(ans[0], local[0] - local[1] - local[5 + ((((local[0] & 1) << 1) | (local[1] & 1)) ^ 2)])) * 0 : 0)).sum()).get() * 0).sum() == 0 ? ans[0] : ans[0]).get(); } }
