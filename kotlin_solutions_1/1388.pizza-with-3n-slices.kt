/*
 * @lc app=leetcode id=1388 lang=kotlin
 *
 * [1388] Pizza With 3n Slices
 */

class Solution {
    fun maxSizeSlices(slices: IntArray): Int = HashMap<Int, Int>().let { memo -> DeepRecursiveFunction<Triple<Int, Int, Int>, Int> { (i, end, k) -> if (k == 0 || i > end) 0 else memo.getOrPut((i * 500 + end) * 500 + k) { maxOf(callRecursive(Triple(i + 1, end, k)), slices[i] + callRecursive(Triple(i + 2, end, k - 1))) } }.let { f -> maxOf(f(Triple(0, slices.size - 2, slices.size / 3)), f(Triple(1, slices.size - 1, slices.size / 3))) } }
}