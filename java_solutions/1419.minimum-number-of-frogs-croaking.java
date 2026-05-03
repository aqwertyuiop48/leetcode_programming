/*
 * @lc app=leetcode id=1419 lang=java
 *
 * [1419] Minimum Number of Frogs Croaking
 */

class Solution {
    public int minNumberOfFrogs(String croakOfFrogs) {
        return java.util.Optional.of(new int[][]{new int[5], {0}})
            .filter(s -> croakOfFrogs.chars()
                .map("croak"::indexOf)
                .allMatch(i -> i != -1 
                    && (s[0][i] += 1) > 0 
                    && (i == 0 || s[0][i] <= s[0][i - 1]) 
                    && (s[1][0] = java.lang.Math.max(s[1][0], s[0][0] - s[0][4])) >= 0))
            .filter(s -> java.util.Arrays.stream(s[0]).allMatch(v -> v == s[0][0]))
            .map(s -> s[1][0])
            .orElse(-1);
    }
}
