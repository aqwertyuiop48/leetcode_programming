/*
 * @lc app=leetcode id=507 lang=kotlin
 *
 * [507] Perfect Number
 */

class Solution { fun checkPerfectNumber(num: Int): Boolean = num.takeIf { it != 1 }?.let { n -> Math.sqrt(n.toDouble()).toInt() .let { if (n and 1 == 1) it + (it and 1) - 1 else it } .let { upperbound -> (upperbound downTo 2 step if (n and 1 == 1) 2 else 1) .filter { n % it == 0 } .fold(n) { acc, divisor -> acc - divisor - n / divisor } == 1 } } ?: false}
