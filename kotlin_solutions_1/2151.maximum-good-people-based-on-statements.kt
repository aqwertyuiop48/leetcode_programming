/* @lc app=leetcode id=2151 lang=kotlin */
class Solution {
    fun maximumGood(A: Array<IntArray>) = (0 until (1 shl A.size)).filter { mask -> (0 until A.size).all { i -> (mask shr i and 1 == 0) || (0 until A.size).all { j -> A[i][j] == 2 || A[i][j] == (mask shr j and 1) } } }.maxOfOrNull { Integer.bitCount(it) } ?: 0
}