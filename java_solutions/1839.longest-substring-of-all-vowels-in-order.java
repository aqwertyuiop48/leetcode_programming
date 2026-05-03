/*
 * @lc app=leetcode id=1839 lang=java
 *
 * [1839] Longest Substring Of All Vowels in Order
 */

class Solution {
    public int longestBeautifulSubstring(String word) {
        return java.util.Optional.of(new int[]{1, 1, 0}).map(s -> word.length() == 0 ? 0 : java.util.stream.IntStream.range(1, word.length()).map(i -> (word.charAt(i) >= word.charAt(i-1) ? (s[0]++) : (s[0] = 1)) * 0 + (word.charAt(i) > word.charAt(i-1) ? (s[1]++) : (s[0] == 1 ? (s[1] = 1) : 0)) * 0 + (s[1] == 5 ? (s[2] = Math.max(s[2], s[0])) : 0)).max().isPresent() ? s[2] : 0).get();
    }
}
