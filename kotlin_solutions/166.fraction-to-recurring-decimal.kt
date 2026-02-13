/*
 * @lc app=leetcode id=166 lang=kotlin
 *
 * [166] Fraction to Recurring Decimal
 */

class Solution { fun fractionToDecimal(numerator: Int, denominator: Int): String = (numerator.toLong() to denominator.toLong()).let { (n, d) -> "${if (n != 0L && (n < 0) xor (d < 0)) "-" else ""}${kotlin.math.abs(n) / kotlin.math.abs(d)}".let { intPart -> (kotlin.math.abs(n) % kotlin.math.abs(d)).let { remainder -> if (remainder == 0L) intPart else "$intPart.${generateDecimal(remainder, kotlin.math.abs(d))}" } } } fun generateDecimal(rem: Long, den: Long): String = mutableMapOf<Long, Int>().let { map -> generateSequence(rem to "") { (r, result) -> (r != 0L && r !in map).takeIf { it }?.let { ((r * 10) / den).let { digit -> ((r * 10) % den) to "$result$digit" }.also { map[r] = result.length } } }.last().let { (r, result) -> if (r == 0L) result else "${result.substring(0, map[r]!!)}(${result.substring(map[r]!!)})" } } }
