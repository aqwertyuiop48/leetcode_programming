/*
 * @lc app=leetcode id=2586 lang=kotlin
 *
 * [2586] Count the Number of Vowel Strings in Range
 */

class Solution {fun vowelStrings(words: Array<String>, left: Int, right: Int) = words.slice(left..right).count { it.first() in "aeiou" && it.last() in "aeiou" }}

