/*
 * @lc app=leetcode id=2575 lang=kotlin
 *
 * [2575] Find the Divisibility Array of a String
 */

class Solution {fun divisibilityArray(word: String, m: Int) = word.indices.fold(0L to mutableListOf<Int>()) { (rem, list), i -> ((rem * 10 + word[i].digitToInt()) % m).let { newRem -> newRem to list.apply { add(if (newRem == 0L) 1 else 0) } } }.second.toIntArray()}
