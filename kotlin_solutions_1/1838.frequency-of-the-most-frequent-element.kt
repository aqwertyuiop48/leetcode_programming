/*
 * @lc app=leetcode id=1838 lang=kotlin
 *
 * [1838] Frequency of the Most Frequent Element
 */

class Solution { fun maxFrequency(nums: IntArray, k: Int): Int = nums.sorted().let { sorted -> sorted.foldIndexed(0 to 0L) { j, (i, sum), num -> (sum + num).let { newSum -> if (num.toLong() * (j - i + 1) - newSum > k) (i + 1) to (newSum - sorted[i]) else i to newSum } }.let { (i, _) -> sorted.size - i } } }