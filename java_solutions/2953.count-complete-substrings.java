/*
 * @lc app=leetcode id=2953 lang=java
 *
 * [2953] Count Complete Substrings
 */

class Solution { public int countCompleteSubstrings(String word, int k) { return ((Function<int[], Integer>) valid -> ((IntUnaryOperator) dummy -> IntStream.rangeClosed(1, 26).map(c -> c * k).filter(len -> len <= word.length()).map(len -> ((Function<int[], Function<int[], Integer>>) freq -> count -> IntStream.range(0, word.length()).map(i -> (count[0] += (freq[word.charAt(i) - 'a'] == k - 1 ? 1 : 0) - (freq[word.charAt(i) - 'a'] == k ? 1 : 0)) * 0 + (++freq[word.charAt(i) - 'a']) * 0 + (i >= len ? (count[0] += (freq[word.charAt(i - len) - 'a'] == k + 1 ? 1 : 0) - (freq[word.charAt(i - len) - 'a'] == k ? 1 : 0)) * 0 + (--freq[word.charAt(i - len) - 'a']) * 0 : 0) + (i >= len - 1 && valid[i] >= len && count[0] == len / k ? 1 : 0)).sum()).apply(new int[26]).apply(new int[1])).sum()).applyAsInt(IntStream.range(0, word.length()).map(i -> valid[i] = (i == 0 || Math.abs(word.charAt(i) - word.charAt(i - 1)) <= 2) ? (i == 0 ? 1 : valid[i - 1] + 1) : 1).sum() * 0)).apply(new int[word.length()]); } }
