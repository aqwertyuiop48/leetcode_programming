/*
 * @lc app=leetcode id=43 lang=kotlin
 *
 * [43] Multiply Strings
 */

class Solution {fun multiply(num1: String, num2: String): String {return (java.math.BigInteger(num1)*java.math.BigInteger(num2)).toString()}}

