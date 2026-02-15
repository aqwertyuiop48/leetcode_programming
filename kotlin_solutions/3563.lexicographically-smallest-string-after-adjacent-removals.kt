/*
 * @lc app=leetcode id=3563 lang=kotlin
 *
 * [3563] Lexicographically Smallest String After Adjacent Removals
 */

class Solution {fun lexicographicallySmallestString(sIn: String): String {return if (sIn.isEmpty()) "" else {Array<String>(sIn.length + 1) { "" }.also { dpArr ->Array(sIn.length) { BooleanArray(sIn.length) }.also { rt ->(2..sIn.length step 2).forEach { len ->(0..sIn.length - len).forEach { i ->rt[i][i + len - 1] = ({ a: Char, b: Char -> kotlin.math.abs(a - b) == 1 || a == 'a' && b == 'z' || a == 'z' && b == 'a' }(sIn[i], sIn[i + len - 1]) && (len == 2 || rt[i + 1][i + len - 1 - 1])) || (i + 1 until (i + len - 1) step 2).any { p -> rt[i][p] && rt[p + 1][i + len - 1] }}}}.also { remTable ->(sIn.length - 1 downTo 0).forEach { i ->(sIn[i] + dpArr[i + 1]).also { defaultVal -> dpArr[i] = defaultVal }.run {(i + 1 until sIn.length).filter { k -> ({ a: Char, b: Char -> kotlin.math.abs(a - b) == 1 || a == 'a' && b == 'z' || a == 'z' && b == 'a' }(sIn[i], sIn[k])) }.filter { k -> k - 1 < i + 1 || remTable[i + 1][k - 1] }.map { k -> dpArr[k + 1] }.minOrNull()?.let { candidate -> if (candidate < dpArr[i]) dpArr[i] = candidate }}}}}[0]}}}
