/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
// semicolons: 1
class Solution {
    public String longestPalindrome(String s) {
        return IntStream.range(0, 2 * s.length()).mapToObj(i -> Stream.iterate(new int[]{i / 2, i / 2 + i % 2}, p -> p[0] >= 0 && p[1] < s.length() && s.charAt(p[0]) == s.charAt(p[1]), p -> new int[]{p[0] - 1, p[1] + 1}).reduce((a, b) -> b).orElse(new int[]{i / 2, i / 2 + i % 2 - 1})).max(Comparator.comparingInt(p -> p[1] - p[0])).map(p -> s.substring(p[0], p[1] + 1)).orElse("");
    }
}
// @lc code=end

