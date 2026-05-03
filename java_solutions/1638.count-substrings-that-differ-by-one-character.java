/*
 * @lc app=leetcode id=1638 lang=java
 *
 * [1638] Count Substrings That Differ by One Character
 */

class Solution {
    public int countSubstrings(String s, String t) {
        return java.util.stream.IntStream.range(0, s.length()).flatMap(i -> java.util.stream.IntStream.range(0, t.length()).map(j -> new int[2] instanceof int[] v ? (int)java.util.stream.IntStream.range(0, Math.min(s.length() - i, t.length() - j)).takeWhile(k -> (v[0] += s.charAt(i + k) != t.charAt(j + k) ? 1 : 0) <= 1).filter(k -> v[0] == 1).count() : 0)).sum();
    }
}
