/*
 * @lc app=leetcode id=1144 lang=kotlin
 *
 * [1144] Decrease Elements To Make Array Zigzag
 */

class Solution { fun movesToMakeZigzag(a: IntArray): Int = (0..1).minOf { p -> (p until a.size step 2).sumOf { i -> maxOf(0, a[i] - minOf(if (i > 0) a[i - 1] else 10000, if (i < a.size - 1) a[i + 1] else 10000) + 1) } } }