/*
 * @lc app=leetcode id=389 lang=kotlin
 *
 * [389] Find the Difference
 */

class Solution {fun findTheDifference(s: String, t: String): Char = (s + t).fold(0) { acc, c -> acc xor c.code }.toChar()}