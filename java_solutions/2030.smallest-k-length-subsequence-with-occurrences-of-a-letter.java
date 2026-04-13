/*
 * @lc app=leetcode id=2030 lang=java
 *
 * [2030] Smallest K-Length Subsequence With Occurrences of a Letter
 */

class Solution { public String smallestSubsequence(String s, int k, char letter, int repetition) { return ((Function<char[], Function<int[], String>>) st -> state -> (state[1] = (int) s.chars().filter(c -> c == letter).count()) * 0 == 0 && IntStream.range(0, s.length()).reduce(0, (acc, i) -> IntStream.iterate(0, d -> state[0] > 0 && st[state[0] - 1] > s.charAt(i) && (s.length() - i + state[0] > k) && (st[state[0] - 1] != letter || state[1] > state[2]), d -> d + 1).reduce(0, (a, d) -> (st[--state[0]] == letter ? (state[2]++) * 0 : 0)) * 0 + (state[0] < k ? (s.charAt(i) == letter ? (st[state[0]++] = s.charAt(i)) * 0 + (state[2]--) * 0 : (k - state[0] > state[2] ? (st[state[0]++] = s.charAt(i)) * 0 : 0)) : 0) + (s.charAt(i) == letter ? (state[1]--) * 0 : 0)) * 0 == 0 ? new String(st, 0, k) : "").apply(new char[s.length()]).apply(new int[]{0, 0, repetition}); } }
