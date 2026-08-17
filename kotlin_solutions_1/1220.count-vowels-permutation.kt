/*
 * @lc app=leetcode id=1220 lang=kotlin
 *
 * [1220] Count Vowels Permutation
 */

class Solution {
    fun countVowelPermutation(n: Int): Int = (1 until n).fold(longArrayOf(1, 1, 1, 1, 1)) { (a, e, i, o, u), _ -> longArrayOf(e, (a + i) % 1000000007, (a + e + o + u) % 1000000007, (i + u) % 1000000007, a) }.sum().rem(1000000007).toInt()
}