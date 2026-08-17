/* @lc app=leetcode id=2310 lang=kotlin */
class Solution { fun minimumNumbers(num: Int, k: Int): Int = if (num == 0) 0 else (1..10).find { i -> i * k % 10 == num % 10 && i * k <= num } ?: -1 }