/*
 * @lc app=leetcode id=130 lang=java
 *
 * [130] Surrounded Regions
 */

class Solution {
    public void solve(char[][] b) {
        if (b.length > 0 && java.util.stream.Stream.<java.util.function.BiFunction<Integer, Integer, Boolean>[]>of(new java.util.function.BiFunction[1]).peek(f -> f[0] = (i, j) -> i >= 0 && j >= 0 && i < b.length && j < b[0].length && b[i][j] == 'O' ? java.util.stream.Stream.of(b[i][j] = 'T').map(dummy -> f[0].apply(i + 1, j) || f[0].apply(i - 1, j) || f[0].apply(i, j + 1) || f[0].apply(i, j - 1)).findFirst().get() : false).peek(f -> java.util.stream.IntStream.range(0, b.length).forEach(i -> java.util.stream.Stream.of(f[0].apply(i, 0)).forEach(dummy -> f[0].apply(i, b[0].length - 1)))).peek(f -> java.util.stream.IntStream.range(0, b[0].length).forEach(j -> java.util.stream.Stream.of(f[0].apply(0, j)).forEach(dummy -> f[0].apply(b.length - 1, j)))).peek(f -> java.util.stream.IntStream.range(0, b.length).forEach(i -> java.util.stream.IntStream.range(0, b[0].length).forEach(j -> b[i][j] = b[i][j] == 'T' ? 'O' : 'X'))).count() > -1) return;
    }
}
