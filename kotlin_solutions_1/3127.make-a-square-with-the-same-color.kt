/*
 * @lc app=leetcode id=3127 lang=kotlin
 *
 * [3127] Make a Square with the Same Color
 */

class Solution {
    fun canMakeSquare(grid: Array<CharArray>): Boolean = (0..1).any { r -> (0..1).any { c -> listOf(grid[r][c], grid[r+1][c], grid[r][c+1], grid[r+1][c+1]).count { it == 'B' }.let { b -> b >= 3 || b <= 1 } } }
}