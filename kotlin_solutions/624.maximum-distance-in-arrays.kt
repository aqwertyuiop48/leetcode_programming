/*
 * @lc app=leetcode id=624 lang=kotlin
 *
 * [624] Maximum Distance in Arrays
 */
class Solution { fun maxDistance(arrays: List<List<Int>>): Int = arrays.drop(1).fold(arrays[0].first() to arrays[0].last() to 0) { (minMax, maxDist), arr -> (minOf(minMax.first, arr.first()) to maxOf(minMax.second, arr.last())) to maxOf(maxDist, maxOf(arr.last() - minMax.first, minMax.second - arr.first())) }.second }