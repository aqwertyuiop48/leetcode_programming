/*
 * @lc app=leetcode id=1894 lang=kotlin
 *
 * [1894] Find the Student that Will Replace the Chalk
 */

class Solution { fun chalkReplacer(chalk: IntArray, k: Int): Int = chalk.runningFold(0L) { acc, x -> acc + x }.let { pref -> pref.drop(1).indexOfFirst { it > k % pref.last() } } }