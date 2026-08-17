/*
 * @lc app=leetcode id=3457 lang=java
 *
 * [3457] Eat Pizzas!
 */
class Solution { fun maxWeight(pizzas: IntArray): Long = pizzas.sorted().let { s -> (pizzas.size / 4).let { d -> ((d + 1) / 2).let { o -> (0 until o).sumOf { s[s.size - 1 - it].toLong() } + (0 until d / 2).sumOf { s[s.size - o - 2 - 2 * it].toLong() } } } } }