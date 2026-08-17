/*
 * @lc app=leetcode id=1744 lang=kotlin
 *
 * [1744] Can You Eat Your Favorite Candy on Your Favorite Day?
 */
class Solution { fun canEat(candiesCount: IntArray, queries: Array<IntArray>): BooleanArray = LongArray(candiesCount.size + 1).also { pref -> candiesCount.indices.forEach { i -> pref[i + 1] = pref[i] + candiesCount[i] } }.let { pref -> BooleanArray(queries.size) { i -> queries[i][1].toLong() < pref[queries[i][0] + 1] && (queries[i][1].toLong() + 1) * queries[i][2] > pref[queries[i][0]] } } }