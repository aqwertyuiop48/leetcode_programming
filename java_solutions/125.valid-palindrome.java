/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

class Solution {
    public boolean isPalindrome(String s) {
        return (s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "")).equals(new StringBuilder(s).reverse().toString());
    }
}
