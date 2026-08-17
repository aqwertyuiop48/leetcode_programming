/*
 * @lc app=leetcode id=1616 lang=kotlin
 *
 * [1616] Split Two Strings to Make Palindrome
 */

class Solution {
    fun checkPalindromeFormation(a: String, b: String): Boolean = { x: String, y: String -> ((0 until x.length / 2).firstOrNull { i -> x[i] != y[x.length - 1 - i] } ?: (x.length / 2)).let { i -> x.substring(i, x.length - i).let { s -> s == s.reversed() } || y.substring(i, y.length - i).let { s -> s == s.reversed() } } }.let { check -> check(a, b) || check(b, a) }
}