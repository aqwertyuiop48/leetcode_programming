/*
 * @lc app=leetcode id=1876 lang=java
 *
 * [1876] Substrings of Size Three with Distinct Characters
 */

class Solution {
    public int countGoodSubstrings(String s) {
        return (int) IntStream.range(0, s.length() - 2)
            .filter(i -> s.charAt(i) != s.charAt(i + 1) && 
                         s.charAt(i) != s.charAt(i + 2) && 
                         s.charAt(i + 1) != s.charAt(i + 2))
            .count();
    }
}
