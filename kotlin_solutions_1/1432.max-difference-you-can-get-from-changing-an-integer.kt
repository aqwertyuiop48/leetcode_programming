/*
 * @lc app=leetcode id=1432 lang=kotlin
 *
 * [1432] Max Difference You Can Get From Changing an Integer
 */

class Solution { fun maxDiff(num: Int): Int = num.toString().let { s -> (s.firstOrNull { it != '9' }?.let { s.replace(it, '9') } ?: s).toInt() - (if (s[0] != '1') s.replace(s[0], '1') else (s.drop(1).firstOrNull { it != '0' && it != '1' }?.let { s.replace(it, '0') } ?: s)).toInt() } }