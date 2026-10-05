/*
 * @lc app=leetcode id=3989 lang=java
 *
 * [3989] Maximum Consistent Columns in a Grid
 */

class Solution {
public int maxConsistentColumns(int[][] grid, int limit) {
    return IntStream.range(0, grid[0].length).collect(ArrayList<Integer>::new, (dp, j) -> dp.add(1 + IntStream.range(0, j).filter(i -> Arrays.stream(grid).allMatch(r -> Math.abs(r[i] - r[j]) <= limit)).map(dp::get).max().orElse(0)), ArrayList::addAll).stream().mapToInt(Integer::intValue).max().orElse(0);
}
}
