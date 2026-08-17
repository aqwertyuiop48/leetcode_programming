/*
 * @lc app=leetcode id=1041 lang=kotlin
 *
 * [1041] Robot Bounded In Circle
 */

class Solution { fun isRobotBounded(instructions: String): Boolean = instructions.fold(intArrayOf(0, 0, 0)) { (x, y, d), c -> when (c) { 'G' -> {intArrayOf(x + intArrayOf(0, 1, 0, -1)[d], y + intArrayOf(1, 0, -1, 0)[d], d)} 'L' -> {intArrayOf(x, y, (d + 3) % 4)} else -> {intArrayOf(x, y, (d + 1) % 4)} } }.let { (x, y, d) -> (x == 0 && y == 0) || d != 0 } }