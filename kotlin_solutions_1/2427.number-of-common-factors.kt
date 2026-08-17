/* @lc app=leetcode id=2427 lang=kotlin */
class Solution {
    fun commonFactors(a: Int, b: Int): Int = (1..minOf(a, b)).count { a % it == 0 && b % it == 0 }
}