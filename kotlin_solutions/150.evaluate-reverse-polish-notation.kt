/*
 * @lc app=leetcode id=150 lang=kotlin
 *
 * [150] Evaluate Reverse Polish Notation
 */

class Solution { fun evalRPN(tokens: Array<String>): Int = tokens.fold(mutableListOf<Int>()) { stack, token -> when (token) { "+", "-", "*", "/" -> stack.apply { removeLast().let { b -> removeLast().let { a -> add(when (token) { "+" -> a + b "-" -> a - b "*" -> a * b else -> a / b }) } } } else -> stack.apply { add(token.toInt()) } } }.last() }
