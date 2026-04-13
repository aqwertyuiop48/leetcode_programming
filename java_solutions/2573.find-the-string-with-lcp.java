/*
 * @lc app=leetcode id=2573 lang=java
 *
 * [2573] Find the String with LCP
 */

class Solution { public String findTheString(int[][] lcp) { return ((Function<char[], Function<int[], String>>) word -> state -> IntStream.range(0, lcp.length).reduce(0, (acc, i) -> word[i] == 0 ? (state[0] > 'z' ? (state[1] = 1) * 0 : (word[i] = (char)state[0]++) * 0 + IntStream.range(i + 1, lcp.length).reduce(0, (acc2, j) -> (lcp[i][j] > 0 ? (word[j] = word[i]) * 0 : 0) * 0) * 0) : 0) * 0 == 0 && state[1] == 0 && IntStream.range(0, lcp.length).reduce(0, (acc, i) -> IntStream.range(0, lcp.length).reduce(0, (acc2, j) -> word[i] != word[j] ? (lcp[i][j] != 0 ? (state[1] = 1) * 0 : 0) : (lcp[i][j] != (i == lcp.length - 1 || j == lcp.length - 1 ? 1 : lcp[i+1][j+1] + 1) ? (state[1] = 1) * 0 : 0)) * 0) * 0 == 0 && state[1] == 0 ? new String(word) : "").apply(new char[lcp.length]).apply(new int[]{'a', 0}); } }
