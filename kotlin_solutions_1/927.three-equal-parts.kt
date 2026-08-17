/*
 * @lc app=leetcode id=927 lang=kotlin
 *
 * [927] Three Equal Parts
 */

class Solution {
    fun threeEqualParts(arr: IntArray): IntArray = arr.indices.filter { arr[it] == 1 }.let { ones -> if (ones.isEmpty()) intArrayOf(0, 2) else if (ones.size % 3 != 0) intArrayOf(-1, -1) else (ones.size / 3).let { k -> (arr.size - ones[2 * k]).let { len -> if (ones[0] + len <= ones[k] && ones[k] + len <= ones[2 * k] && (0 until len).all { arr[ones[0] + it] == arr[ones[k] + it] && arr[ones[0] + it] == arr[ones[2 * k] + it] }) intArrayOf(ones[0] + len - 1, ones[k] + len) else intArrayOf(-1, -1) } } }
}