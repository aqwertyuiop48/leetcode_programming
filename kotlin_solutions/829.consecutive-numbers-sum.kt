/*
 * @lc app=leetcode id=829 lang=kotlin
 *
 * [829] Consecutive Numbers Sum
 */

class Solution { fun consecutiveNumbersSum(n: Int): Int = (2..n).takeWhile { (1 + it) * it / 2 <= n } .count { i -> (if (i % 2 == 0) n - i / 2 else n).let { curN -> curN % i == 0 && curN / i - (ceil(i.toDouble() / 2) - 1) > 0 } } + 1 }

