/*
 * @lc app=leetcode id=528 lang=kotlin
 *
 * [528] Random Pick with Weight
 */

class Solution(w: IntArray, val sums: List<Int> = w.runningFold(0) { acc, weight -> acc + weight }.drop(1)) { fun pickIndex() = java.util.Random().nextInt(sums.last()).let { target -> sums.binarySearch { if (it <= target) -1 else 1 }.let { if (it >= 0) it else -it - 1 } } }
