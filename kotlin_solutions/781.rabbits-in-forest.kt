/*
 * @lc app=leetcode id=781 lang=kotlin
 *
 * [781] Rabbits in Forest
 */

class Solution { fun numRabbits(answers: IntArray): Int = answers.toList().groupingBy { it }.eachCount().entries.sumOf { (k, v) -> (v + k) / (k + 1) * (k + 1) } }

