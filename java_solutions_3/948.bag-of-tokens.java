/*
 * @lc app=leetcode id=948 lang=java
 *
 * [948] Bag of Tokens
 */

class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        return java.util.Arrays.stream(tokens).sorted().toArray() instanceof int[] t && new int[]{0, t.length - 1, power, 0, 0} instanceof int[] s
            && java.util.stream.Stream.of(0).peek(z -> {
                while (s[0] <= s[1] && (s[2] >= t[s[0]] ? (s[2] -= t[s[0]++]) >= 0 && (s[4] = Math.max(s[4], ++s[3])) >= 0 : s[3] > 0 && (s[2] += t[s[1]--]) >= 0 && --s[3] >= 0)) {}
            }).anyMatch(z -> true)
            ? s[4] : 0;
    }
}
