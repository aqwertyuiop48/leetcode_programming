/*
 * @lc app=leetcode id=168 lang=kotlin
 *
 * [168] Excel Sheet Column Title
 */

class Solution { fun convertToTitle(columnNumber: Int) = generateSequence(columnNumber - 1) { (it / 26) - 1 } .takeWhile { it >= 0 } .distinct() .fold("") { acc, i -> acc + ('A' + i % 26) } .reversed() }
