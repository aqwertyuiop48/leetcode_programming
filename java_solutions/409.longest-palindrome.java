/*
 * @lc app=leetcode id=409 lang=java
 *
 * [409] Longest Palindrome
 */

class Solution {
    public int longestPalindrome(String s) {
        return Optional.of(s.chars().boxed().collect(Collectors.groupingBy(c -> c, Collectors.counting())).values()).map(counts -> counts.stream().mapToInt(Long::intValue).map(c -> c / 2 * 2).sum() + (counts.stream().anyMatch(c -> c % 2 != 0) ? 1 : 0)).get();
    }
}
