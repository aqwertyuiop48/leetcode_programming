/*
 * @lc app=leetcode id=658 lang=kotlin
 *
 * [658] Find K Closest Elements
 */

class Solution { fun findClosestElements(arr: IntArray, k: Int, x: Int): List<Int> = arr.indices.minByOrNull { kotlin.math.abs(arr[it] - x) * 100000 + it }!!.let { mid -> generateSequence(mid to mid) { (l, r) -> when { r - l + 1 >= k -> {null} l == 0 -> {l to r + 1} r == arr.lastIndex ->{l - 1 to r} kotlin.math.abs(arr[l - 1] - x) <= kotlin.math.abs(arr[r + 1] - x) -> {l - 1 to r} else -> l to r + 1 }}.last().let { (l, r) -> arr.slice(l..r) } } }
