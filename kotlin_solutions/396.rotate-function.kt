/*
 * @lc app=leetcode id=396 lang=kotlin
 *
 * [396] Rotate Function
 */

class Solution {fun maxRotateFunction(A: IntArray): Int = A.foldIndexed(0 to 0) { i, (s, a), it -> (s + it * i) to (a + it) }.let { (s, a) -> (A.size - 1 downTo 0).fold(s to s) { (curr, m), i -> (curr - A[i] * A.size + a).let { it to maxOf(it, m) } }.second }}

