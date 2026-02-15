/*
 * @lc app=leetcode id=2578 lang=kotlin
 *
 * [2578] Split With Minimum Sum
 */

class Solution {fun splitNum(num: Int) = num.toString().toList().sorted().joinToString("").let { sorted -> sorted.filterIndexed { i, _ -> i % 2 == 0 }.toInt() + sorted.filterIndexed { i, _ -> i % 2 != 0 }.toInt() }}

