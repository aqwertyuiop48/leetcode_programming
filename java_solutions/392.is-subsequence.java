/*
 * @lc app=leetcode id=392 lang=java
 *
 * [392] Is Subsequence
 */

// semicolons : 1
class Solution {
    public boolean isSubsequence(String s, String t) {
        return Optional.of(new int[]{0}).map(i -> t.chars().filter(c -> i[0] < s.length() && c == s.charAt(i[0])).peek(c -> i[0]++).count() == s.length()).get();
    }
}
