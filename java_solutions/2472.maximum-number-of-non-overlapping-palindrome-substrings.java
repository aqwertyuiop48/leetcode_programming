/*
 * @lc app=leetcode id=2472 lang=java
 *
 * [2472] Maximum Number of Non-overlapping Palindrome Substrings
 */

class Solution { public int maxPalindromes(String s, int k) { return ((Function<int[], Integer>) state -> (int)IntStream.iterate(0, dummy -> state[0] <= s.length() - k, dummy -> dummy).map(dummy -> ((IntUnaryOperator) found -> found > 0 ? (state[0] += found) * 0 + (state[1]++) * 0 : (state[0]++) * 0).applyAsInt(IntStream.rangeClosed(k, k + 1).filter(len -> state[0] + len <= s.length() && IntStream.range(0, len / 2).allMatch(x -> s.charAt(state[0] + x) == s.charAt(state[0] + len - 1 - x))).findFirst().orElse(0))).sum() * 0 + state[1]).apply(new int[2]); } }
