/* @lc app=leetcode id=1686 lang=kotlin */
class Solution {
    fun stoneGameVI(aliceValues: IntArray, bobValues: IntArray): Int = aliceValues.indices.sortedByDescending { aliceValues[it] + bobValues[it] }.foldIndexed(0L) { i, a, j -> if (i % 2 == 0) a + aliceValues[j] else a - bobValues[j] }.let { it.compareTo(0) }
}