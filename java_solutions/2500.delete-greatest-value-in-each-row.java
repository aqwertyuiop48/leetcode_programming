/*
 * @lc app=leetcode id=2500 lang=java
 *
 * [2500] Delete Greatest Value in Each Row
 */

class Solution {
    public int deleteGreatestValue(int[][] grid) {
        return IntStream.range(0, grid[0].length)
            .map(j -> IntStream.range(0, grid.length)
                .map(i -> Arrays.stream(grid[i]).sorted().toArray()[j])
                .max().getAsInt())
            .sum();
    }
}
