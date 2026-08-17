/*
 * @lc app=leetcode id=3035 lang=kotlin
 *
 * [3035] Maximum Palindromes After Operations
 */

class Solution { fun maxPalindromesAfterOperations(words: Array<String>): Int = (words.flatMap { it.toList() }.groupingBy { it }.eachCount().values.sumOf { it / 2 }).let { totalPairs -> words.map { it.length }.sorted().fold(totalPairs to 0) { (pairs, ans), len -> if (pairs >= len / 2) (pairs - len / 2) to (ans + 1) else pairs to ans }.second } }