/*
 * @lc app=leetcode id=1815 lang=kotlin
 *
 * [1815] Maximum Number of Groups Getting Fresh Donuts
 */

class Solution { fun maxHappyGroups(batchSize: Int, groups: IntArray): Int = groups.count { it % batchSize == 0 } + HashMap<Long, Int>().let { memo -> Array<((Long, Int) -> Int)?>(1) { null }.apply { this[0] = { state, rem -> memo[state or (rem.toLong() shl 60)] ?: ((0 until batchSize).filter { i -> i > 0 && ((state ushr (i * 5)) and 31L) > 0L }.map { i -> (if (rem == 0) 1 else 0) + this[0]!!(state - (1L shl (i * 5)), (rem + i) % batchSize) }.maxOrNull() ?: 0).also { memo[state or (rem.toLong() shl 60)] = it } } }[0]!!(groups.filter { it % batchSize != 0 }.fold(0L) { acc, g -> acc + (1L shl ((g % batchSize) * 5)) }, 0) } }