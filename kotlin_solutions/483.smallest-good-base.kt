/*
 * @lc app=leetcode id=483 lang=kotlin
 *
 * [483] Smallest Good Base
 */
class Solution { fun smallestGoodBase(n: String): String = n.toLong().let { num -> ((Math.log(num + 1.0) / Math.log(2.0)).toInt() - 1 downTo 2).firstNotNullOfOrNull { m -> num.toDouble().pow(1.0 / m).toLong().takeIf { k -> (0..m).fold(0L) { acc, _ -> 1 + acc * k } == num } } ?: (num - 1) }.toString() }
