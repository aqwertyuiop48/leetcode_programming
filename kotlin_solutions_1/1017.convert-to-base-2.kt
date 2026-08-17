/*
 * @lc app=leetcode id=1017 lang=kotlin
 *
 * [1017] Convert to Base -2
 */

class Solution {
    fun baseNeg2(n: Int): String = if (n == 0) "0" else generateSequence(n to "") { (curr, str) -> if (curr == 0) null else (curr % -2).let { rem -> if (rem < 0) (curr / -2 + 1) to "${rem + 2}$str" else (curr / -2) to "$rem$str" } }.last().second
}