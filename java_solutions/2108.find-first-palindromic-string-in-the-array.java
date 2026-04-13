/*
 * @lc app=leetcode id=2108 lang=java
 *
 * [2108] Find First Palindromic String in the Array
 */

class Solution {
    public String firstPalindrome(String[] words) {
        return Arrays.stream(words)
            .filter(w -> IntStream.range(0, w.length() / 2)
                .allMatch(i -> w.charAt(i) == w.charAt(w.length() - 1 - i)))
            .findFirst()
            .orElse("");
    }
}
