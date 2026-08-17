/* @lc app=leetcode id=941 lang=kotlin */

class Solution {
    fun validMountainArray(arr: IntArray): Boolean = (arr.size >= 3).takeIf { it }?.let { object { tailrec fun step(i: Int, comp: (Int, Int) -> Boolean): Int = if (i + 1 < arr.size && comp(arr[i], arr[i + 1])) step(i + 1, comp) else i } }?.run { step(0) { a, b -> a < b }.takeIf { it > 0 && it < arr.size - 1 }?.let { step(it) { a, b -> a > b } == arr.size - 1 } } ?: false
}