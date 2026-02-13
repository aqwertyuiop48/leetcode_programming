/*
 * @lc app=leetcode id=227 lang=kotlin
 *
 * [227] Basic Calculator II
 */

class Solution {fun calculate(s: String) = (s.filter { it != ' ' } + "+").fold(listOf(0, 1, 0, 1, '+'.code)) { state, ch -> state.let { (result, accum, curr, sign, prevOp) -> when (ch) { in '0'..'9' -> {listOf(result, accum, curr * 10 + (ch - '0'), sign, prevOp)} else -> (if (prevOp.toChar() == '/') accum / curr else accum * curr).let { newAccum -> if (ch == '+' || ch == '-') listOf(result + sign * newAccum, 1, 0, if (ch == '+') 1 else -1, ch.code) else listOf(result, newAccum, 0, sign, ch.code) } } } }[0]}