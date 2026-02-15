/*
 * @lc app=leetcode id=879 lang=kotlin
 *
 * [879] Profitable Schemes
 */

class Solution { fun profitableSchemes(n: Int, minProfit: Int, group: IntArray, profit: IntArray) = Array(group.size) { Array(n + 1) { IntArray(minProfit + 1) { -1 } } }.let { memo -> DeepRecursiveFunction<Triple<Int, Int, Int>, Int> { (start, maxPeople, minProf) -> when { maxPeople < 0 -> {0} start >= group.size -> {if (minProf <= 0) 1 else 0} memo[start][maxPeople][minProf] != -1 -> {memo[start][maxPeople][minProf]} else -> ((callRecursive(Triple(start + 1, maxPeople - group[start], maxOf(minProf - profit[start], 0))) + callRecursive(Triple(start + 1, maxPeople, minProf))) % 1000000007).also { memo[start][maxPeople][minProf] = it } } }(Triple(0, n, minProfit)) } }

