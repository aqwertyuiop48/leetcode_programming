/*
 * @lc app=leetcode id=840 lang=java
 *
 * [840] Magic Squares In Grid
 */

class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        return (int) java.util.stream.IntStream.range(0, Math.max(0, grid.length - 2) * Math.max(0, grid[0].length - 2))
            .filter(k -> java.util.stream.IntStream.range(0, 9).map(t -> grid[k / (grid[0].length - 2) + t / 3][k % (grid[0].length - 2) + t % 3]).toArray() instanceof int[] v
                && java.util.Arrays.stream(v).distinct().count() == 9 && java.util.Arrays.stream(v).allMatch(x -> x >= 1 && x <= 9)
                && java.util.Arrays.stream(new int[][]{{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}}).allMatch(l -> v[l[0]] + v[l[1]] + v[l[2]] == 15)).count();
    }
}
