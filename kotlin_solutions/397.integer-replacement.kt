/*
 * @lc app=leetcode id=397 lang=kotlin
 *
 * [397] Integer Replacement
 */

class Solution { fun integerReplacement(n: Int): Int { if (n == 1) { return 0 } else if (n == Int.MAX_VALUE) {return 32} else{ if (n % 2 == 0) { return 1 + integerReplacement(n / 2) } else { return 1 + Math.min(integerReplacement(n + 1), integerReplacement(n - 1)) } } } }
