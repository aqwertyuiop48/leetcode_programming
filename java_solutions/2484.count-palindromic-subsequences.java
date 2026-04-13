/*
 * @lc app=leetcode id=2484 lang=java
 *
 * [2484] Count Palindromic Subsequences
 */

class Solution { public int countPalindromes(String s) { return ((Function<int[][][], Function<int[][][], Function<int[], Integer>>>) pre -> suf -> cnts -> IntStream.range(0, s.length()).map(i -> (i > 0 ? IntStream.range(0, 100).map(x -> (pre[i][x / 10][x % 10] = pre[i - 1][x / 10][x % 10] + (x % 10 == s.charAt(i) - '0' ? cnts[x / 10] : 0)) * 0).sum() : 0) * 0 + (cnts[s.charAt(i) - '0']++) * 0).sum() * 0 + ((Function<int[], Integer>) cnts2 -> IntStream.iterate(s.length() - 1, i -> i >= 0, i -> i - 1).map(i -> (i < s.length() - 1 ? IntStream.range(0, 100).map(x -> (suf[i][x / 10][x % 10] = suf[i + 1][x / 10][x % 10] + (x % 10 == s.charAt(i) - '0' ? cnts2[x / 10] : 0)) * 0).sum() : 0) * 0 + (cnts2[s.charAt(i) - '0']++) * 0).sum() * 0 + IntStream.range(2, s.length() - 2).map(i -> IntStream.range(0, 100).map(x -> (int)(1L * pre[i - 1][x / 10][x % 10] * suf[i + 1][x / 10][x % 10] % 1000000007)).reduce(0, (a, b) -> (a + b) % 1000000007)).reduce(0, (a, b) -> (a + b) % 1000000007)).apply(new int[10])).apply(new int[s.length()][10][10]).apply(new int[s.length()][10][10]).apply(new int[10]); } }
