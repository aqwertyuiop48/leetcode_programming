/*
 * @lc app=leetcode id=87 lang=kotlin
 *
 * [87] Scramble String
 */

class Solution { fun isScramble(s1: String, s2: String): Boolean = mutableMapOf<String, Boolean>().run { DeepRecursiveFunction<Pair<String, String>, Boolean> { (a, b) -> getOrPut("$a*$b") { a == b || MutableList(26) { 0 }.apply { a.forEach { this[it - 'a']++ } } .let { freqA -> MutableList(26) { 0 }.apply { b.forEach { this[it - 'a']++ } } .let { freqB -> (freqA == freqB).let { isAnagram -> isAnagram && (1 until a.length).any { i -> (callRecursive(a.take(i) to b.take(i)) && callRecursive(a.drop(i) to b.drop(i))) || (callRecursive(a.take(i) to b.takeLast(i)) && callRecursive(a.drop(i) to b.dropLast(i))) } } } } } }.invoke(s1 to s2) } }
