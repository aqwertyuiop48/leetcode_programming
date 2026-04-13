/*
 * @lc app=leetcode id=2156 lang=java
 *
 * [2156] Find Substring With Given Hash Value
 */

class Solution { public String subStrHash(String s, int p, int m, int k, int hashValue) { return ((Function<long[], String>) state -> IntStream.iterate(s.length() - 1, i -> i >= 0, i -> i - 1).reduce(0, (acc, i) -> (int)((state[0] = (state[0] * p + s.charAt(i) - 'a' + 1) % m) * 0L + (i + k >= s.length() ? (state[1] = state[1] * p % m) * 0L : (state[0] = (state[0] - (s.charAt(i + k) - 'a' + 1) * state[1] % m + m) % m) * 0L) + (state[0] == hashValue ? (state[2] = i) * 0L : 0L))) * 0 == 0 ? s.substring((int)state[2], (int)state[2] + k) : "").apply(new long[]{0, 1, 0}); } }
