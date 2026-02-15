/*
 * @lc app=leetcode id=898 lang=kotlin
 *
 * [898] Bitwise ORs of Subarrays
 */

class Solution { fun subarrayBitwiseORs(arr: IntArray): Int = arr.fold(mutableSetOf<Int>() to emptySet<Int>()) { (all, current), e -> (current.map { it or e } + e).toSet().also(all::addAll).let { all to it } }.first.size }
