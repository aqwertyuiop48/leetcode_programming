/*
 * @lc app=leetcode id=433 lang=kotlin
 *
 * [433] Minimum Genetic Mutation
 */

class Solution { fun minMutation(startGene: String, endGene: String, bank: Array<String?>): Int = intArrayOf(-1).let { found -> generateSequence(LinkedList<Pair<String, Int>>().apply { add(startGene to 0) } to bank) { (q, b) -> q.poll()?.let { (curr, steps) -> b.indices.fold(q to b) { (queue, bankArray), i -> bankArray[i]?.let { next -> if (curr.indices.count { curr[it] != next[it] } == 1) { if (next == endGene) (steps + 1).also { found[0] = it }.let { queue to bankArray } else (queue.apply { add(next to (steps + 1)) }) to bankArray.apply { this[i] = null } } else queue to bankArray } ?: (queue to bankArray) }.takeIf { found[0] == -1 } } }.takeWhile { found[0] == -1 }.count().let { found[0] } } }

