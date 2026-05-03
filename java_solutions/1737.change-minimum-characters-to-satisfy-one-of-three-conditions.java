/*
 * @lc app=leetcode id=1737 lang=java
 *
 * [1737] Change Minimum Characters to Satisfy One of Three Conditions
 */

class Solution {
    public int minCharacters(String a, String b) {
        return java.util.Optional.of(new int[][]{new int[26], new int[26]}).filter(f -> a.chars().allMatch(c -> (f[0][c - 'a']++ >= 0) || true) && b.chars().allMatch(c -> (f[1][c - 'a']++ >= 0) || true)).map(f -> java.util.stream.IntStream.range(0, 26).map(i -> Math.min(i == 0 ? Integer.MAX_VALUE : java.util.stream.IntStream.range(i, 26).map(j -> f[0][j]).sum() + java.util.stream.IntStream.range(0, i).map(j -> f[1][j]).sum(), Math.min(i == 0 ? Integer.MAX_VALUE : java.util.stream.IntStream.range(i, 26).map(j -> f[1][j]).sum() + java.util.stream.IntStream.range(0, i).map(j -> f[0][j]).sum(), a.length() - f[0][i] + b.length() - f[1][i]))).min().getAsInt()).get();
    }
}
