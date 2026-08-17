/*
 * @lc app=leetcode id=1237 lang=kotlin
 *
 * [1237] Find Positive Integer Solution for a Given Equation
 */
class Solution { fun findSolution(customfunction: CustomFunction, z: Int): List<List<Int>> = (1..1000).flatMap { x -> (1..1000).mapNotNull { y -> listOf(x, y).takeIf { customfunction.f(x, y) == z } } } }