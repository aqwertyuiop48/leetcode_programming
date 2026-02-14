/*
 * @lc app=leetcode id=537 lang=kotlin
 *
 * [537] Complex Number Multiplication
 */

class Solution { fun complexNumberMultiply(num1: String, num2: String) = num1.split("+", "i").let { (a1, b1) -> num2.split("+", "i").let { (a2, b2) -> "${a1.toInt() * a2.toInt() - b1.toInt() * b2.toInt()}+${a1.toInt() * b2.toInt() + b1.toInt() * a2.toInt()}i" } } }

