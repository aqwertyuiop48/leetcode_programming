/*
 * @lc app=leetcode id=509 lang=kotlin
 *
 * [509] Fibonacci Number
 */

class Solution {fun fib(n: Int): Int = if (n <= 1) n else fib(n - 1) + fib(n - 2)}
