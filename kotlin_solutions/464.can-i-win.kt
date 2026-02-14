/*
 * @lc app=leetcode id=464 lang=kotlin
 *
 * [464] Can I Win
 */

class Solution { fun canIWin(maxChoosableInteger: Int, desiredTotal: Int): Boolean = when { desiredTotal <= 0 -> {true} maxChoosableInteger * (maxChoosableInteger + 1) / 2 < desiredTotal -> {false} else -> mutableMapOf<Int, Boolean>().let { memo -> DeepRecursiveFunction<Pair<Int, Int>, Boolean> { (state, total) -> memo.getOrPut(state) { (1..maxChoosableInteger).any { i -> ((1 shl (i - 1)) and state == 0) && (total + i >= desiredTotal || !callRecursive((state or (1 shl (i - 1))) to (total + i))) } } }.invoke(0 to 0) } } }