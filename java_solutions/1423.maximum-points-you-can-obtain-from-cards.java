/*
 * @lc app=leetcode id=1423 lang=java
 *
 * [1423] Maximum Points You Can Obtain from Cards
 */

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        return new int[]{java.util.Arrays.stream(cardPoints, 0, k).sum()} instanceof int[] s && new int[]{s[0]} instanceof int[] m && java.util.stream.IntStream.range(0, k).allMatch(i -> (m[0] = Math.max(m[0], s[0] += cardPoints[cardPoints.length - 1 - i] - cardPoints[k - 1 - i])) >= -1e9) ? m[0] : 0;
    }
}
