/*
 * @lc app=leetcode id=224 lang=kotlin
 *
 * [224] Basic Calculator
 */

class Solution { fun calculate(s: String): Int = s.fold(Triple(0, 1, 0) to emptyList<Pair<Int, Int>>()) { (state, stack), ch -> when { ch.isDigit() -> {Triple(state.first, state.second, state.third * 10 + (ch - '0')) to stack} ch == '+' -> {Triple(state.first + state.second * state.third, 1, 0) to stack} ch == '-' -> {Triple(state.first + state.second * state.third, -1, 0) to stack} ch == '(' -> {Triple(0, 1, 0) to (stack + (state.first to state.second))} ch == ')' -> {Triple((state.first + state.second * state.third) * stack.last().second + stack.last().first, 1, 0) to stack.dropLast(1)} else -> state to stack } }.let { (state, _) -> state.first + state.second * state.third } }

