/*
 * @lc app=leetcode id=1707 lang=kotlin
 *
 * [1707] Maximum XOR With an Element From Array
 */

class Solution {
    fun maximizeXor(nums: IntArray, queries: Array<IntArray>): IntArray = nums.sortedArray().let { sortedNums -> queries.indices.sortedBy { queries[it][1] }.let { qIndices -> Array(nums.size * 30 + 2) { IntArray(2) }.let { trie -> intArrayOf(0, 1).let { state -> IntArray(queries.size).also { ans -> qIndices.forEach { qi -> generateSequence { state[0] }.takeWhile { it < sortedNums.size && sortedNums[it] <= queries[qi][1] }.forEach { idx -> (29 downTo 0).fold(0) { cur, b -> ((sortedNums[idx] shr b) and 1).let { bit -> trie[cur][bit].takeIf { it != 0 } ?: state[1]++.also { trie[cur][bit] = it } } }.let { state[0]++ } }.let { ans[qi] = if (state[0] == 0) -1 else (29 downTo 0).fold(0 to 0) { (cur, res), b -> ((queries[qi][0] shr b) and 1).let { bit -> (1 - bit).let { want -> if (trie[cur][want] != 0) trie[cur][want] to (res or (1 shl b)) else trie[cur][bit] to res } } }.second } } } } } } }
}