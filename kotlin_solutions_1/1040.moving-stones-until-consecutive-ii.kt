/*
 * @lc app=leetcode id=1040 lang=kotlin
 *
 * [1040] Moving Stones Until Consecutive II
 */

class Solution { fun numMovesStonesII(stones: IntArray): IntArray = stones.sorted().let { s -> intArrayOf( s.indices.fold(0 to s.size) { (j, minM), i -> generateSequence(j) { if (it + 1 < s.size && s[it + 1] - s[i] + 1 <= s.size) it + 1 else null }.last().let { nj -> nj to minOf(minM, if (nj - i + 1 == s.size - 1 && s[nj] - s[i] + 1 == s.size - 1) 2 else s.size - (nj - i + 1)) } }.second, maxOf(s[s.size - 1] - s[1] - s.size + 2, s[s.size - 2] - s[0] - s.size + 2) ) } }