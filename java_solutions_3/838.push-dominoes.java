/*
 * @lc app=leetcode id=838 lang=java
 *
 * [838] Push Dominoes
 */

class Solution {
    public String pushDominoes(String dominoes) {
        return new int[dominoes.length()] instanceof int[] f && new int[]{0} instanceof int[] c
            && java.util.stream.IntStream.range(0, dominoes.length()).peek(i -> f[i] += (c[0] = dominoes.charAt(i) == 'R' ? dominoes.length() : dominoes.charAt(i) == 'L' ? 0 : Math.max(c[0] - 1, 0))).allMatch(x -> true)
            && (c[0] = 0) == 0
            && java.util.stream.IntStream.iterate(dominoes.length() - 1, i -> i >= 0, i -> i - 1).peek(i -> f[i] -= (c[0] = dominoes.charAt(i) == 'L' ? dominoes.length() : dominoes.charAt(i) == 'R' ? 0 : Math.max(c[0] - 1, 0))).allMatch(x -> true)
            ? java.util.stream.IntStream.range(0, dominoes.length()).mapToObj(i -> f[i] > 0 ? "R" : f[i] < 0 ? "L" : ".").collect(java.util.stream.Collectors.joining()) : "";
    }
}
