/*
 * @lc app=leetcode id=779 lang=kotlin
 *
 * [779] K-th Symbol in Grammar
 */

class Solution {fun kthGrammar(n: Int, k: Int): Int = (k - 1).let { it.countOneBits() and 1 }}
