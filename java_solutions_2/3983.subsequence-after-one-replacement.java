/*
 * @lc app=leetcode id=3983 lang=java
 *
 * [3983] Subsequence After One Replacement
 */

class Solution {
    public boolean canMakeSubsequence(String s, String t) {
        return s.length() <= t.length() && java.util.stream.Stream.generate(() -> new int[][]{new int[s.length() + 1], new int[s.length() + 1]})
                .limit(1)
                .peek(arr -> arr[0][0] = -1)
                .peek(arr -> java.util.stream.IntStream.range(0, s.length()).forEachOrdered(i -> arr[0][i + 1] = arr[0][i] >= t.length() ? t.length() : (t.indexOf(s.charAt(i), arr[0][i] + 1) != -1 ? t.indexOf(s.charAt(i), arr[0][i] + 1) : t.length())))
                .peek(arr -> arr[1][s.length()] = t.length())
                .peek(arr -> java.util.stream.IntStream.range(0, s.length()).forEachOrdered(k -> arr[1][s.length() - 1 - k] = arr[1][s.length() - k] <= 0 ? -1 : t.lastIndexOf(s.charAt(s.length() - 1 - k), arr[1][s.length() - k] - 1)))
                .anyMatch(arr -> java.util.stream.IntStream.range(0, s.length()).anyMatch(i -> arr[0][i] + 1 < arr[1][i + 1]));
    }
}
