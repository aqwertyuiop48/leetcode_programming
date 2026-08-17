/*
 * @lc app=leetcode id=2094 lang=kotlin
 *
 * [2094] Finding 3-Digit Even Numbers
 */

class Solution {
    fun findEvenNumbers(digits: IntArray): IntArray = IntArray(10).apply { digits.forEach { set(it, get(it) + 1) } }.let { count -> (100..998 step 2).filter { n -> IntArray(10).apply { n.toString().forEach { set(it - '0', get(it - '0') + 1) } }.let { req -> (0..9).all { count[it] >= req[it] } } }.toIntArray() }
}