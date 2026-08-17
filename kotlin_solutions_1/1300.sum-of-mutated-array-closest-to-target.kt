/*
 * @lc app=leetcode id=1300 lang=kotlin
 *
 * [1300] Sum of Mutated Array Closest to Target
 */

class Solution {
    fun findBestValue(arr: IntArray, target: Int): Int =
        intArrayOf(0, arr.maxOrNull() ?: 0).let { range ->
            generateSequence { range[0].takeIf { range[0] < range[1] } }
                .forEach { _ ->
                    (range[0] + (range[1] - range[0]) / 2).let { mid ->
                        if (arr.sumOf { minOf(it, mid) } >= target) range[1] = mid
                        else range[0] = mid + 1
                    }
                }
            range[0].let { ans ->
                if (Math.abs(arr.sumOf { minOf(it, ans - 1) } - target) <= Math.abs(arr.sumOf { minOf(it, ans) } - target)) ans - 1 else ans
            }
        }
}