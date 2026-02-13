/*
 * @lc app=leetcode id=315 lang=kotlin
 *
 * [315] Count of Smaller Numbers After Self
 */

class Solution { fun countSmaller(nums: IntArray): List<Int> = nums.size.let { n -> nums.sorted().let { s -> FenwickTree(n).let { fw -> IntArray(n).apply { (n - 1 downTo 0).forEach { i -> s.binarySearch(nums[i]).let { r -> if (r < 0) -r - 1 else r }.let { rank -> this[i] = (if (rank - 1 >= 0) fw.query(rank - 1) else 0L).toInt().also { fw.update(rank, 1) } } } } }.toList() } } } class FenwickTree(n: Int, private val tree: LongArray = LongArray(n + 1)) { fun update(i: Int, add: Int) = generateSequence(i + 1) { it + (it and -it) }.takeWhile { it < tree.size }.forEach { tree[it] += add } fun query(i: Int): Long = generateSequence(i + 1) { it - (it and -it) }.takeWhile { it > 0 }.sumOf { tree[it] } }
