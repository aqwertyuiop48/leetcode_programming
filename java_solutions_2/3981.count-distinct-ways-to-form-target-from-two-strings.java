/*
 * @lc app=leetcode id=3981 lang=java
 *
 * [3981] Count Distinct Ways to Form Target from Two Strings
 */

class Solution {
public int interleaveCharacters(String word1, String word2, String target) {
    return (int) IntStream.range(0, target.length()).boxed().reduce(IntStream.rangeClosed(0, word1.length()).mapToObj(i -> LongStream.rangeClosed(0, word2.length()).map(j -> i > 0 && j > 0 ? 1 : 0).toArray()).toArray(long[][]::new), (F, idx) -> Stream.<long[][][]>of(new long[][][]{new long[word1.length() + 2][word2.length() + 1], new long[word1.length() + 1][word2.length() + 2], new long[word1.length() + 1][word2.length() + 1]}).peek(h -> IntStream.rangeClosed(0, word1.length()).map(i -> word1.length() - i).forEach(i -> IntStream.rangeClosed(0, word2.length()).map(j -> word2.length() - j).forEach(j -> h[2][i][j] = ((h[0][i][j] = (h[0][i + 1][j] + (i < word1.length() && word1.charAt(i) == target.charAt(target.length() - 1 - idx) ? F[i + 1][j] : 0)) % 1_000_000_007L) + (h[1][i][j] = (h[1][i][j + 1] + (j < word2.length() && word2.charAt(j) == target.charAt(target.length() - 1 - idx) ? F[i][j + 1] : 0)) % 1_000_000_007L)) % 1_000_000_007L))).map(h -> h[2]).findFirst().get(), (a, b) -> a)[0][0];
}
}
