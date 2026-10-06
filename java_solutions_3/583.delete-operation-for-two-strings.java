/*
 * @lc app=leetcode id=583 lang=java
 *
 * [583] Delete Operation for Two Strings
 */

class Solution {
    public int minDistance(String word1, String word2) {
        return new int[word1.length() + 1][word2.length() + 1] instanceof int[][] d
            && java.util.stream.IntStream.rangeClosed(1, word1.length()).peek(i -> java.util.stream.IntStream.rangeClosed(1, word2.length())
                .forEach(j -> d[i][j] = word1.charAt(i - 1) == word2.charAt(j - 1) ? d[i - 1][j - 1] + 1 : Math.max(d[i - 1][j], d[i][j - 1]))).allMatch(x -> true)
            ? word1.length() + word2.length() - 2 * d[word1.length()][word2.length()] : 0;
    }
}
