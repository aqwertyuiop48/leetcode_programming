/*
 * @lc app=leetcode id=1471 lang=kotlin
 *
 * [1471] The k Strongest Values in an Array
 */

class Solution {
    fun getStrongest(arr: IntArray, k: Int): IntArray = arr.sorted().let { sorted -> sorted[(sorted.size - 1) / 2].let { m -> arr.sortedDescending().sortedByDescending { Math.abs(it - m) }.take(k).toIntArray() } }
}