/*
 * @lc app=leetcode id=3274 lang=java
 *
 * [3274] Check if Two Chessboard Squares Have the Same Color
 */

class Solution {
    fun checkTwoChessboards(c1: String, c2: String): Boolean = (c1[0].code + c1[1].code) % 2 == (c2[0].code + c2[1].code) % 2
}