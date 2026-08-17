/*
 * @lc app=leetcode id=1157 lang=kotlin
 *
 * [1157] Online Majority Element In Subarray
 */

class MajorityChecker(val arr: IntArray, val pos: Map<Int, List<Int>> = arr.indices.groupBy { arr[it] }) { fun query(left: Int, right: Int, threshold: Int): Int = (1..40).firstNotNullOfOrNull { arr[kotlin.random.Random.nextInt(left, right + 1)].takeIf { c -> pos[c]!!.let { l -> (l.binarySearch(right + 1).let { if (it < 0) -it - 1 else it } - l.binarySearch(left).let { if (it < 0) -it - 1 else it }) >= threshold } } } ?: -1 }