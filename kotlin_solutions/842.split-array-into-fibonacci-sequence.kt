/*
 * @lc app=leetcode id=842 lang=kotlin
 *
 * [842] Split Array into Fibonacci Sequence
 */

class Solution { fun splitIntoFibonacci(num: String): List<Int> = mutableListOf<Int>().let { result -> DeepRecursiveFunction<Int, Boolean> { i -> (i == num.length).let { atEnd -> if (atEnd) result.size > 2 else (i until num.length).any { j -> (j > i && num[i] == '0').let { leadingZero -> !leadingZero && (j - i < 11).let { validLength -> validLength && num.substring(i, j + 1).toLongOrNull()?.let { n -> (n <= Int.MAX_VALUE).let { notOverflow -> notOverflow && result.size.let { size -> (size < 2 || n <= result[size - 1] + result[size - 2]).let { notTooLarge -> notTooLarge && (size <= 1 || n == (result[size - 1] + result[size - 2]).toLong()).let { valid -> valid && result.add(n.toInt()).let { callRecursive(j + 1).also { success -> if (!success) result.removeLast() } } } } } } } ?: false } } } } }.invoke(0).let { result } } }