/*
 * @lc app=leetcode id=710 lang=kotlin
 *
 * [710] Random Pick with Blacklist
 */

class Solution(n: Int, blacklist: IntArray, private val map: MutableMap<Int, Int> = blacklist.toSet().let { bl -> (n - bl.size until n).filter { it !in bl }.let { whites -> bl.filter { it < n - bl.size }.zip(whites).toMap().toMutableMap() } }, private val size: Int = n - blacklist.size) { fun pick(): Int = (0 until size).random().let { map[it] ?: it } }

