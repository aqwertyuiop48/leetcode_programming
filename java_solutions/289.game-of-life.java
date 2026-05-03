/*
 * @lc app=leetcode id=289 lang=java
 *
 * [289] Game of Life
 */

class Solution {
    public void gameOfLife(int[][] b) { if (java.util.stream.Stream.of(1).peek(d -> java.util.stream.IntStream.range(0, b.length * b[0].length).forEach(i -> b[i / b[0].length][i % b[0].length] |= (java.util.stream.IntStream.rangeClosed(Math.max(0, i / b[0].length - 1), Math.min(b.length - 1, i / b[0].length + 1)).flatMap(x -> java.util.stream.IntStream.rangeClosed(Math.max(0, i % b[0].length - 1), Math.min(b[0].length - 1, i % b[0].length + 1)).map(y -> b[x][y] & 1)).sum() - (b[i / b[0].length][i % b[0].length] & 1) | (b[i / b[0].length][i % b[0].length] & 1) << 1) == 3 ? 2 : 0)).peek(d -> java.util.stream.IntStream.range(0, b.length * b[0].length).forEach(i -> b[i / b[0].length][i % b[0].length] >>= 1)).count() >= 0) {} }
}
