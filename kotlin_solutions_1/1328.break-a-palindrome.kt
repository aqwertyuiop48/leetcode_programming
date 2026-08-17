/*
 * @lc app=leetcode id=1328 lang=kotlin
 *
 * [1328] Break a Palindrome
 */

class Solution { fun breakPalindrome(palindrome: String): String = palindrome.takeIf { it.length > 1 }?.toCharArray()?.let { c -> (0 until c.size / 2).firstOrNull { c[it] != 'a' }?.let { c.also { array -> array[it] = 'a' } } ?: c.also { array -> array[array.size - 1] = 'b' } }?.concatToString() ?: "" }