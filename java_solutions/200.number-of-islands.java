/*
 * @lc app=leetcode id=200 lang=java
 *
 * [200] Number of Islands
 */

class Solution {
    public int numIslands(char[][] grid) {
        return java.util.stream.IntStream.range(0, grid.length).map(i -> java.util.stream.IntStream.range(0, grid[0].length).map(j -> grid[i][j] == '1' ? java.util.stream.Stream.iterate(new java.util.LinkedList<int[]>(java.util.Arrays.asList(new int[]{i, j, grid[i][j] = '0'})), q -> !q.isEmpty(), q -> java.util.stream.Stream.of(q.poll()).map(curr -> java.util.stream.Stream.of(new int[][]{{1,0},{-1,0},{0,1},{0,-1}}).map(d -> new int[]{curr[0] + d[0], curr[1] + d[1]}).filter(n -> n[0] >= 0 && n[0] < grid.length && n[1] >= 0 && n[1] < grid[0].length && grid[n[0]][n[1]] == '1').map(n -> q.offer(new int[]{n[0], n[1], grid[n[0]][n[1]] = '0'})).count() > -1 ? q : q).findFirst().get()).count() > -1 ? 1 : 0 : 0).sum()).sum();
    }
}
