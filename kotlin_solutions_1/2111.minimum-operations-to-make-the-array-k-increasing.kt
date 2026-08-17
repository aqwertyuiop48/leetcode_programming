/* @lc app=leetcode id=2111 lang=kotlin */
class Solution {
    fun kIncreasing(arr: IntArray, k: Int): Int = arr.size - (0 until k).sumOf { i -> mutableListOf<Int>().apply { (i until arr.size step k).forEach { j -> arr[j].let { x -> binarySearch { if (it <= x) -1 else 1 }.let { if (it < 0) -it - 1 else it }.let { pos -> if (pos == size) add(x) else set(pos, x) } } } }.size }
}