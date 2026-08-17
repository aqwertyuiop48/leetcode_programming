/*
 * @lc app=leetcode id=1276 lang=kotlin
 *
 * [1276] Number of Burgers with No Waste of Ingredients
 */

class Solution {
    fun numOfBurgers(tomatoSlices: Int, cheeseSlices: Int): List<Int> = if (tomatoSlices % 2 == 0 && tomatoSlices >= 2 * cheeseSlices && tomatoSlices <= 4 * cheeseSlices) listOf(tomatoSlices / 2 - cheeseSlices, 2 * cheeseSlices - tomatoSlices / 2) else emptyList()
}