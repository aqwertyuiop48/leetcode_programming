/*
 * @lc app=leetcode id=728 lang=kotlin
 *
 * [728] Self Dividing Numbers
 */
class Solution { fun selfDividingNumbers(left: Int, right: Int) = (left..right).filter { n -> n.toString().all { it != '0' && n % it.digitToInt() == 0 } } }