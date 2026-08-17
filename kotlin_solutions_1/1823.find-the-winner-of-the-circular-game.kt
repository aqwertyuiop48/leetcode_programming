/*
 * @lc app=leetcode id=1823 lang=kotlin
 *
 * [1823] Find the Winner of the Circular Game
 */

class Solution { fun findTheWinner(n: Int, k: Int): Int = (2..n).fold(0) { acc, i -> (acc + k) % i } + 1 }