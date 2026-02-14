/*
 * @lc app=leetcode id=592 lang=kotlin
 *
 * [592] Fraction Addition and Subtraction
 */

import kotlin.math.abs class Solution { fun fractionAddition(exp: String): String = DeepRecursiveFunction<Pair<Int, Int>, Int> { (a, b) -> if (a == 0) b else callRecursive(b % a to a) }.let { gcd -> Regex("([+-]?\\d+)/(\\d+)").findAll(exp).map { it.groupValues.run { get(1).toInt() to get(2).toInt() } }.toList().run { map { it.second }.reduce { a, b -> a / gcd(a to b) * b }.let { lcm -> fold(0) { acc, (num, den) -> acc + num * (lcm / den) }.let { totalNum -> (if (totalNum == 0) 0 to 1 else gcd(abs(totalNum) to lcm).let { g -> totalNum / g to lcm / g }).run { "$first/$second" } } } } } }

