/*
 * @lc app=leetcode id=657 lang=kotlin
 *
 * [657] Robot Return to Origin
 */

class Solution { fun judgeCircle(moves: String): Boolean = moves.fold(0 to 0) { (x, y), c -> when(c) { 'U' -> x to y+1 'D' -> x to y-1 'L' -> x-1 to y 'R' -> x+1 to y else -> x to y } }.let { it == 0 to 0 } }
