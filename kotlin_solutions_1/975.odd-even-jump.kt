/* @lc app=leetcode id=975 lang=kotlin */

class Solution {
    fun oddEvenJumps(arr: IntArray): Int = BooleanArray(arr.size).apply { this[size - 1] = true }.let { odd -> BooleanArray(arr.size).apply { this[size - 1] = true }.let { even -> java.util.TreeMap<Int, Int>().apply { put(arr[arr.size - 1], arr.size - 1) }.let { map -> (arr.size - 2 downTo 0).forEach { i -> map.ceilingEntry(arr[i])?.value?.let { odd[i] = even[it] }.also { map.floorEntry(arr[i])?.value?.let { even[i] = odd[it] } }.also { map.put(arr[i], i) } }.let { odd.count { it } } } }
}}