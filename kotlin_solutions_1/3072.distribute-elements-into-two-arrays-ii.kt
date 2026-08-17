/*
 * @lc app=leetcode id=3072 lang=kotlin
 *
 * [3072] Distribute Elements Into Two Arrays II
 */

class Solution { fun resultArray(nums: IntArray): IntArray = nums.sorted().distinct().let { sorted -> IntArray(sorted.size + 2).let { bit1 -> IntArray(sorted.size + 2).let { bit2 -> ({ x: Int -> sorted.binarySearch(x) + 1 }).let { rank -> ({ bit: IntArray, x: Int -> generateSequence(rank(x)) { it + (it and -it) }.takeWhile { it < bit.size }.forEach { bit[it]++ } }).let { add -> ({ bit: IntArray, size: Int, x: Int -> size - generateSequence(rank(x)) { it - (it and -it) }.takeWhile { it > 0 }.sumOf { bit[it] } }).let { gc -> mutableListOf(nums[0]).also { add(bit1, nums[0]) } to mutableListOf(nums[1]).also { add(bit2, nums[1]) }.let { (a1, a2) -> nums.drop(2).fold(a1 to a2) { (a1, a2), x -> gc(bit1, a1.size, x).compareTo(gc(bit2, a2.size, x)).let { cmp -> if (cmp > 0 || (cmp == 0 && a1.size <= a2.size)) a1.apply { add(x) }.also { add(bit1, x) } to a2 else a1 to a2.apply { add(x) }.also { add(bit2, x) } } }.run { (first + second).toIntArray() } } } } } } } }