/*
 * @lc app=leetcode id=575 lang=kotlin
 *
 * [575] Distribute Candies
 */

class Solution {fun distributeCandies(candyType: IntArray): Int {return minOf(candyType.toSet().size,candyType.size/2)}}