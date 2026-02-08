/*
 * @lc app=leetcode id=38 lang=kotlin
 *
 * [38] Count and Say
 */

class Solution {fun countAndSay(n: Int): String = (1 until n).fold("1") { res, _ -> Regex("(.)\\1*").findAll(res).fold("") { acc, m -> acc + m.value.length + m.value[0] } }}

