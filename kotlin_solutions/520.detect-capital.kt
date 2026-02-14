/*
 * @lc app=leetcode id=520 lang=kotlin
 *
 * [520] Detect Capital
 */

class Solution { fun detectCapitalUse(word: String) = word.all { it.isUpperCase() } || word.drop(1).all { it.isLowerCase() } }

