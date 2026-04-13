/*
 * @lc app=leetcode id=1987 lang=java
 *
 * [1987] Number of Unique Good Subsequences
 */

class Solution { public int numberOfUniqueGoodSubsequences(String binary) { return ((ToIntFunction<long[]>) state -> binary.chars().reduce(0, (a, c) -> (int)(c == '0' ? (state[0] = (state[0] + state[1]) % 1000000007) * 0L + (state[2] = 1) * 0L : (state[1] = (state[0] + state[1] + 1) % 1000000007) * 0L)) * 0 == 0 ? (int)((state[0] + state[1] + state[2]) % 1000000007) : 0).applyAsInt(new long[3]); } }
