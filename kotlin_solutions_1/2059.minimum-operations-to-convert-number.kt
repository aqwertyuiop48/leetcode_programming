/*
 * @lc app=leetcode id=2059 lang=kotlin
 *
 * [2059] Minimum Operations to Convert Number
 */

class Solution { fun minimumOperations(nums: IntArray, start: Int, goal: Int): Int = if (start == goal) 0 else ArrayDeque<Pair<Int, Int>>().apply { add(start to 0) }.let { q -> BooleanArray(1001).apply { if (start in 0..1000) this[start] = true }.let { vis -> generateSequence { if (q.isNotEmpty()) q.removeFirst() else null }.flatMap { (x, step) -> nums.asSequence().flatMap { num -> sequenceOf(x + num, x - num, x xor num) }.map { nxt -> if (nxt == goal) step + 1 else if (nxt in 0..1000 && !vis[nxt]) vis.set(nxt, true).also { q.addLast(nxt to step + 1) }.run { null } else null } }.filterNotNull().firstOrNull() ?: -1 } } }