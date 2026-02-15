/*
 * @lc app=leetcode id=902 lang=kotlin
 *
 * [902] Numbers At Most N Given Digit Set
 */

class Solution { fun atMostNGivenDigitSet(digits: Array<String>, n: Int) = n.toString().let { s -> (1 until s.length).sumOf { Math.pow(digits.size.toDouble(), it.toDouble()).toInt() } + s.indices.fold(0 to 1) { (res, onPath), i -> if (onPath == 0) res to 0 else res + (digits.count { it[0] < s[i] } * Math.pow(digits.size.toDouble(), (s.length - 1 - i).toDouble())).toInt() to if (digits.any { it[0] == s[i] }) 1 else 0 }.let { it.first + it.second } } }
