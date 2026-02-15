/*
 * @lc app=leetcode id=875 lang=kotlin
 *
 * [875] Koko Eating Bananas
 */

class Solution { fun minEatingSpeed(piles: IntArray, h: Int) = generateSequence(1 to piles.max()!!) { (left, right) -> (left + (right - left) / 2).let { mid -> if (piles.sumOf { (it.toLong() + mid - 1) / mid } <= h) left to mid else (mid + 1) to right }.takeIf { it.first < it.second } }.last().let { (left, right) -> if (piles.sumOf { (it.toLong() + left - 1) / left } <= h) left else right } }
