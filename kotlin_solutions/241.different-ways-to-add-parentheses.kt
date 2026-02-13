/*
 * @lc app=leetcode id=241 lang=kotlin
 *
 * [241] Different Ways to Add Parentheses
 */

class Solution {companion object { private val memo = mutableMapOf<String, List<Int>>() }fun diffWaysToCompute(expression: String): List<Int> = memo.getOrPut(expression) { expression.indices.filter { !expression[it].isDigit() }.flatMap { i -> diffWaysToCompute(expression.substring(0, i)).flatMap { l -> diffWaysToCompute(expression.substring(i + 1)).map { r -> if (expression[i] == '+') l + r else if (expression[i] == '-') l - r else l * r } } }.ifEmpty { listOf(expression.toInt()) } }}
