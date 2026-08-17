/*
 * @lc app=leetcode id=1033 lang=kotlin
 *
 * [1033] Moving Stones Until Consecutive
 */

class Solution {
    fun numMovesStones(a: Int, b: Int, c: Int): IntArray =
        intArrayOf(a, b, c).sorted().let { (x, y, z) ->
            intArrayOf(
                if (z - x == 2) 0 else if (y - x <= 2 || z - y <= 2) 1 else 2,
                z - x - 2
            )
        }
}