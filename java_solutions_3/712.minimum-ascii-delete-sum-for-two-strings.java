/*
 * @lc app=leetcode id=712 lang=java
 *
 * [712] Minimum ASCII Delete Sum for Two Strings
 */

class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        return new int[s1.length() + 1][s2.length() + 1] instanceof int[][] d
            && java.util.stream.IntStream.rangeClosed(1, s1.length()).peek(i -> java.util.stream.IntStream.rangeClosed(1, s2.length())
                .forEach(j -> d[i][j] = s1.charAt(i - 1) == s2.charAt(j - 1) ? d[i - 1][j - 1] + s1.charAt(i - 1) : Math.max(d[i - 1][j], d[i][j - 1]))).allMatch(x -> true)
            ? s1.chars().sum() + s2.chars().sum() - 2 * d[s1.length()][s2.length()] : 0;
    }
}
