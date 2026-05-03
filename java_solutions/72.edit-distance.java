/*
 * @lc app=leetcode id=72 lang=java
 *
 * [72] Edit Distance
 */

class Solution {
    public int minDistance(String word1, String word2) {
        return java.util.stream.Stream.of(java.util.stream.IntStream.rangeClosed(0, word2.length()).toArray()).map(dp -> java.util.stream.IntStream.rangeClosed(1, word1.length()).map(i -> java.util.stream.IntStream.rangeClosed(0, word2.length()).reduce(dp[0], (prevDiag, j) -> j == 0 ? (dp[0] = i) * 0 + prevDiag : java.util.stream.Stream.of(dp[j]).map(temp -> (dp[j] = word1.charAt(i - 1) == word2.charAt(j - 1) ? prevDiag : 1 + Math.min(prevDiag, Math.min(dp[j], dp[j - 1]))) > -1 ? temp : temp).findFirst().get())).count() > -1 ? dp[word2.length()] : 0).findFirst().get();
    }
}
