/*
 * @lc app=leetcode id=1641 lang=java
 *
 * [1641] Count Sorted Vowel Strings
 */

class Solution {
    public int countVowelStrings(int n) {
        return (n + 1) * (n + 2) * (n + 3) * (n + 4) / 24;
    }
}
