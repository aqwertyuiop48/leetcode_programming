/*
 * @lc app=leetcode id=67 lang=kotlin
 *
 * [67] Add Binary
 */

class Solution {fun addBinary(a: String, b: String): String {return (a.toBigInteger(2) + b.toBigInteger(2)).toString(2)}}

