/*
 * @lc app=leetcode id=2231 lang=kotlin
 *
 * [2231] Largest Number After Digit Swaps by Parity
 */

class Solution {
    fun largestInteger(num: Int) = num.toString().let { s -> s.map { it - '0' }.partition { it % 2 == 0 }.let { (e, o) -> e.sortedDescending().iterator().let { ei -> o.sortedDescending().iterator().let { oi -> s.map { if ((it - '0') % 2 == 0) ei.next() else oi.next() }.joinToString("").toInt() } } } }
}