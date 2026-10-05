/*
 * @lc app=leetcode id=3922 lang=java
 *
 * [3922] Minimum Flips to Make Binary String Coherent
 */

class Solution {
public int minFlips(String s) {
    return s.length() < 3 ? 0 : Stream.of(s.chars().filter(c -> c == '0').count()).mapToInt(c0 -> (int) Math.min(c0, Math.min(Math.max(s.length() - c0 - 1, 0), s.length() - c0 - (s.charAt(0) - '0') - (s.charAt(s.length() - 1) - '0')))).sum();
}
}
