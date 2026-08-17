/*
 * @lc app=leetcode id=3360 lang=java
 *
 * [3360] Stone Removal Game
 */
class Solution {
    fun canAliceWin(n: Int): Boolean = generateSequence(Triple(n, 10, false)) { (rem, take, turn) -> if (rem >= take) Triple(rem - take, take - 1, !turn) else null }.last().third
}