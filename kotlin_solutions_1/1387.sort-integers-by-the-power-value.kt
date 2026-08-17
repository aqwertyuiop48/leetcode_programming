/*
 * @lc app=leetcode id=1387 lang=kotlin
 *
 * [1387] Sort Integers by The Power Value
 */

class Solution {
    fun getKth(lo: Int, hi: Int, k: Int): Int = DeepRecursiveFunction<Int, Int> { x -> if (x == 1) 0 else 1 + callRecursive(if (x % 2 == 0) x / 2 else 3 * x + 1) }.let { f -> (lo..hi).sortedBy { f(it) }[k - 1] }
}