/*
 * @lc app=leetcode id=1996 lang=kotlin
 *
 * [1996] The Number of Weak Characters in the Game
 */

class Solution { fun numberOfWeakCharacters(properties: Array<IntArray>): Int = properties.sortedWith(compareByDescending<IntArray> { it[0] }.thenBy { it[1] }).fold(0 to 0) { (count, maxDef), p -> if (p[1] < maxDef) (count + 1) to maxDef else count to p[1] }.first }