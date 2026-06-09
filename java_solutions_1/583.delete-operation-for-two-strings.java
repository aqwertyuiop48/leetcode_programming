/*
 * @lc app=leetcode id=583 lang=java
 *
 * [583] Delete Operation for Two Strings
 */

class Solution {
    public int minDistance(String word1, String word2) {
        return word1.length() + word2.length() - 2 * java.util.stream.Stream.of(new int[word1.length() + 1][word2.length() + 1]).peek(dp -> java.util.stream.IntStream.rangeClosed(1, word1.length()).forEach(i -> java.util.stream.IntStream.rangeClosed(1, word2.length()).forEach(j -> dp[i][j] = word1.charAt(i - 1) == word2.charAt(j - 1) ? dp[i - 1][j - 1] + 1 : Math.max(dp[i - 1][j], dp[i][j - 1])))).map(dp -> dp[word1.length()][word2.length()]).findFirst().get();
    }
}
