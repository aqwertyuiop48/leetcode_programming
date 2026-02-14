/*
 * @lc app=leetcode id=680 lang=kotlin
 *
 * [680] Valid Palindrome II
 */

class Solution { fun validPalindrome(s: String): Boolean = DeepRecursiveFunction<Triple<Int, Int, Boolean>, Boolean> { (l, r, used) -> when { l >= r -> {true} s[l] == s[r] -> {callRecursive(Triple(l + 1, r - 1, used))} used ->{false} else -> callRecursive(Triple(l + 1, r, true)) || callRecursive(Triple(l, r - 1, true)) } }(Triple(0, s.lastIndex, false)) }