/*
 * @lc app=leetcode id=423 lang=kotlin
 *
 * [423] Reconstruct Original Digits from English
 */


class Solution { fun originalDigits(s: String): String = s.groupingBy { it }.eachCount().toMutableMap().let { cnt -> listOf( "zero" to 'z' to 0, "two" to 'w' to 2, "four" to 'u' to 4, "six" to 'x' to 6, "eight" to 'g' to 8, "one" to 'o' to 1, "three" to 'h' to 3, "five" to 'f' to 5, "seven" to 's' to 7, "nine" to 'i' to 9 ).map { (wordChar, digit) -> wordChar.let { (word, uniqueChar) -> (cnt[uniqueChar] ?: 0).also { c -> word.forEach { cnt[it] = (cnt[it] ?: 0) - c } }.let { c -> digit to c } } }.sortedBy { it.first }.flatMap { (d, c) -> List(maxOf(0, c)) { d.toString() } }.joinToString("") } }