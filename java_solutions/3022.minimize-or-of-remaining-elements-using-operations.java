/*
 * @lc app=leetcode id=3022 lang=java
 *
 * [3022] Minimize OR of Remaining Elements Using Operations
 */

class Solution { public int minOrAfterOperations(int[] nums, int k) { return ((ToIntFunction<long[]>) s -> IntStream.rangeClosed(0, 30).map(invJ -> 30 - invJ).reduce(0, (acc, j) -> (int)( (s[1] |= (1 << j)) * 0L + (s[2] = s[1]) * 0L + (s[3] = 0) * 0L + IntStream.of(nums).reduce(0, (acc2, x) -> (int)( (s[2] &= x) * 0L + ((s[2] | s[0]) != s[0] ? (s[3]++) * 0L : (s[2] = s[1]) * 0L) )) * 0L + (s[3] > k ? (s[0] |= (1 << j)) * 0L : 0L) )) * 0 == 0 ? (int)s[0] : 0).applyAsInt(new long[4]); } }
