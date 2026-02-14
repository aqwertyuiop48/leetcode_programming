/*
 * @lc app=leetcode id=470 lang=kotlin
 *
 * [470] Implement Rand10() Using Rand7()
 */

class Solution : SolBase() {fun rand10(): Int = generateSequence { (rand7() - 1) * 7 + rand7() }.first { it <= 40 }.let { (it - 1) % 10 + 1 }}

