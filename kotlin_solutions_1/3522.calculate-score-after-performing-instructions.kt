/*
 * @lc app=leetcode id=3522 lang=kotlin
 *
 * [3522] Calculate Score After Performing Instructions
 */

class Solution { fun calculateScore(instructions: Array<String>, values: IntArray): Long = BooleanArray(values.size).let { vis -> DeepRecursiveFunction<Pair<Int, Long>, Long> { (idx, score) -> if (idx !in values.indices || vis[idx]) score else vis.also { it[idx] = true }.let { if (instructions[idx][0] == 'a') callRecursive((idx + 1) to (score + values[idx])) else callRecursive((idx + values[idx]) to score) } }.invoke(0 to 0L) } }