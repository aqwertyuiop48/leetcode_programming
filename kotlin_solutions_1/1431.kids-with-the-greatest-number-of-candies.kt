/*
 * @lc app=leetcode id=1431 lang=kotlin
 *
 * [1431] Kids With the Greatest Number of Candies
 */

class Solution { fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> = candies.maxOrNull()!!.let { max -> candies.map { it + extraCandies >= max } } }