/*
 * @lc app=leetcode id=3106 lang=kotlin
 *
 * [3106] Lexicographically Smallest String After Operations With Constraint
 */

class Solution {
    fun getSmallestString(s: String, k: Int): String = s.fold(k to "") { (rem, acc), c -> minOf(c - 'a', 'z' - c + 1).let { dist -> if (rem >= dist) (rem - dist) to (acc + 'a') else 0 to (acc + (c - rem)) } }.second
}