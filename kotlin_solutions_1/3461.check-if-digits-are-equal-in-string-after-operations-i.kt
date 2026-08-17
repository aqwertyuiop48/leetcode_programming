/*
 * @lc app=leetcode id=3461 lang=java
 *
 * [3461] Check If Digits Are Equal in String After Operations I
 */
class Solution { fun hasSameDigits(s: String): Boolean = (s.length downTo 3).fold(s.map { it - '0' }) { acc, _ -> List(acc.size - 1) { i -> (acc[i] + acc[i + 1]) % 10 } }.let { it[0] == it[1] } }