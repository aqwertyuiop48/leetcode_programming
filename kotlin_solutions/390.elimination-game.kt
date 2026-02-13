/*
 * @lc app=leetcode id=390 lang=kotlin
 *
 * [390] Elimination Game
 */

class Solution {fun lastRemaining(n: Int): Int = generateSequence(listOf(n, 1, 1, 1)) { (remaining, head, step, leftToRight) -> (remaining > 1).takeIf { it == true }?.let { listOf(remaining / 2, if (leftToRight == 1 || remaining % 2 == 1) head + step else head, step * 2, 1 - leftToRight) } }.last()[1]}