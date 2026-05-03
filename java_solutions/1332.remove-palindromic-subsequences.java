/*
 * @lc app=leetcode id=1332 lang=java
 *
 * [1332] Remove Palindromic Subsequences
 */

class Solution {
    public int removePalindromeSub(String s) {
        return s.isEmpty() ? 0 : new StringBuilder(s).reverse().toString().equals(s) ? 1 : 2;
    }
}
