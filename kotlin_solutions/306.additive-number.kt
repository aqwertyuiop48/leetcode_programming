/*
 * @lc app=leetcode id=306 lang=kotlin
 *
 * [306] Additive Number
 */

class Solution { fun isAdditiveNumber(num: String): Boolean = (1..num.length / 2).any { i -> (1..(num.length - i) / 2).any { j -> num.substring(0, i).let { first -> num.substring(i, i + j).let { second -> (first[0] != '0' || first.length == 1) && (second[0] != '0' || second.length == 1) && checkSequence(num, i + j, first.toBigInteger(), second.toBigInteger()) } } } } fun checkSequence(num: String, start: Int, a: java.math.BigInteger, b: java.math.BigInteger): Boolean = if (start == num.length) true else (a + b).toString().let { sum -> num.substring(start).startsWith(sum) && checkSequence(num, start + sum.length, b, a + b) } }
