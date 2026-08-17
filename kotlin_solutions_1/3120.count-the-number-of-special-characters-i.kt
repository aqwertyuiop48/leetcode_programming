/*
 * @lc app=leetcode id=3120 lang=kotlin
 *
 * [3120] Count the Number of Special Characters I
 */

class Solution {
    fun numberOfSpecialChars(word: String): Int = word.toSet().let { set -> ('a'..'z').count { it in set && it.uppercaseChar() in set } }
}