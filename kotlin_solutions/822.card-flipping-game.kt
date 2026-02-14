/*
 * @lc app=leetcode id=822 lang=kotlin
 *
 * [822] Card Flipping Game
 */

class Solution { fun flipgame(fronts: IntArray, backs: IntArray): Int = fronts.indices.map { fronts[it] to backs[it] }.let { pairs -> pairs.filter { it.first == it.second }.map { it.first }.toSet().let { invalid -> (fronts.toSet() + backs.toSet()).filterNot { it in invalid }.minOrNull() ?: 0 } } }
