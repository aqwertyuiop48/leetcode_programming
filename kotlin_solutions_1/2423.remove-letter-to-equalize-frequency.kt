/* @lc app=leetcode id=2423 lang=kotlin */
class Solution {
    fun equalFrequency(word: String): Boolean = word.indices.any { i -> word.removeRange(i..i).groupingBy { it }.eachCount().values.let { it.distinct().size == 1 } }
}