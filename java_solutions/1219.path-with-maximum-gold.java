/*
 * @lc app=leetcode id=1219 lang=java
 *
 * [1219] Path with Maximum Gold
 */

class Solution {
    public int getMaximumGold(int[][] grid) {
        return new java.util.function.Function[1] instanceof java.util.function.Function[] f && (f[0] = p -> ((int[])p)[0] < 0 || ((int[])p)[0] >= grid.length || ((int[])p)[1] < 0 || ((int[])p)[1] >= grid[0].length || grid[((int[])p)[0]][((int[])p)[1]] == 0 ? 0 : (new Object[]{grid[((int[])p)[0]][((int[])p)[1]], 0} instanceof Object[] o && ((grid[((int[])p)[0]][((int[])p)[1]] = 0) == 0 | true) && ((o[1] = Math.max(Math.max((int)f[0].apply(new int[]{((int[])p)[0]+1, ((int[])p)[1]}), (int)f[0].apply(new int[]{((int[])p)[0]-1, ((int[])p)[1]})), Math.max((int)f[0].apply(new int[]{((int[])p)[0], ((int[])p)[1]+1}), (int)f[0].apply(new int[]{((int[])p)[0], ((int[])p)[1]-1})))) != null | true) && ((grid[((int[])p)[0]][((int[])p)[1]] = (int)o[0]) != -1 | true) ? (int)o[0] + (int)o[1] : 0)) != null ? java.util.stream.IntStream.range(0, grid.length).map(r -> java.util.stream.IntStream.range(0, grid[0].length).map(c -> (int)f[0].apply(new int[]{r, c})).max().orElse(0)).max().orElse(0) : 0;
    }
}
