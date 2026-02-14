/*
 * @lc app=leetcode id=775 lang=kotlin
 *
 * [775] Global and Local Inversions
 */

class Solution { fun isIdealPermutation(A: IntArray): Boolean = A.withIndex().all { (i, v) -> (i - v) in -1..1 } }