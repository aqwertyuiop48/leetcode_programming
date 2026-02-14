/*
 * @lc app=leetcode id=415 lang=kotlin
 *
 * [415] Add Strings
 */

class Solution { fun addStrings(num1: String, num2: String): String = num1.reversed().padEnd(maxOf(num1.length, num2.length), '0') .zip(num2.reversed().padEnd(maxOf(num1.length, num2.length), '0')) .fold("" to 0) { (res, carry), (a, b) -> ((a - '0') + (b - '0') + carry).let { sum -> (sum % 10).toString() + res to sum / 10 } }.let { (res, carry) -> if (carry > 0) carry.toString() + res else res } }

