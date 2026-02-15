/*
 * @lc app=leetcode id=2513 lang=kotlin
 *
 * [2513] Minimize the Maximum of Two Arrays
 */

class Solution { fun minimizeSet(divisor1: Int, divisor2: Int, uniqueCnt1: Int, uniqueCnt2: Int) = generateSequence(1 to Int.MAX_VALUE) { (left, right) -> if (left >= right) null else (left + (right - left) / 2).let { mid -> if (MidIsNotBigEnough(divisor1.toLong(), divisor2.toLong(), uniqueCnt1.toLong(), uniqueCnt2.toLong(), mid.toLong())) (mid + 1) to right else left to mid } }.first { (left, right) -> left >= right }.second fun MidIsNotBigEnough(divisor1: Long, divisor2: Long, uniqueCnt1: Long, uniqueCnt2: Long, n: Long) = (n - n / divisor1).let { a -> (n - n / divisor2).let { b -> (n - (n / divisor1 + n / divisor2 - n / findLCM(divisor1, divisor2))).let { c -> a < uniqueCnt1 || b < uniqueCnt2 || a + b - c < uniqueCnt1 + uniqueCnt2 } } } fun findLCM(a: Long, b: Long) = generateSequence(maxOf(a, b)) { it + maxOf(a, b) }.first { it % a == 0L && it % b == 0L } }

