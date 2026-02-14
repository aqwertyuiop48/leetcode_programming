/*
 * @lc app=leetcode id=640 lang=kotlin
 *
 * [640] Solve the Equation
 */

class Solution {fun solveEquation(equation: String): String = equation.split("=").map { side -> side.replace("-", "+-").split("+").filter { it.isNotEmpty() }.fold(0 to 0) { (x, num), term -> if ('x' in term) (x + (term.dropLast(1).takeIf { it.isNotEmpty() && it != "-" && it != "+" }?.toInt() ?: if (term.startsWith("-")) -1 else 1)) to num else x to (num + term.toInt()) } }.let { (l, r) -> (l.first - r.first) to (r.second - l.second) }.let { (x, num) -> when { x == 0 && num == 0 -> {"Infinite solutions"} x == 0 -> {"No solution"} else -> "x=${num / x}" } }}
