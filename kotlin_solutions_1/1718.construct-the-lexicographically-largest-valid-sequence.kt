/*
 * @lc app=leetcode id=1718 lang=kotlin
 *
 * [1718] Construct the Lexicographically Largest Valid Sequence
 */

class Solution {
    fun constructDistancedSequence(n: Int): IntArray = IntArray(2 * n - 1).let { res -> BooleanArray(n + 1).let { used -> DeepRecursiveFunction<Int, Boolean> { idx -> if (idx == res.size) true else if (res[idx] != 0) callRecursive(idx + 1) else (n downTo 1).any { v -> !used[v] && if (v == 1) res.set(idx, 1).run { used[1] = true }.run { callRecursive(idx + 1) || false.also { res[idx] = 0 }.also { used[1] = false } } else (idx + v < res.size && res[idx + v] == 0) && res.set(idx, v).run { res[idx + v] = v }.run { used[v] = true }.run { callRecursive(idx + 1) || false.also { res[idx] = 0 }.also { res[idx + v] = 0 }.also { used[v] = false } } } }.invoke(0).run { res } } }
}