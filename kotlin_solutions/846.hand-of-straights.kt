/*
 * @lc app=leetcode id=846 lang=kotlin
 *
 * [846] Hand of Straights
 */

class Solution { fun isNStraightHand(hand: IntArray, groupSize: Int): Boolean = hand.size.let { len -> (len % groupSize != 0).let { invalidSize -> if (invalidSize) false else (len / groupSize).let { cou_gr -> PriorityQueue<Int>().apply { hand.forEach { add(it) } }.let { minHeap -> hand.fold(0L) { sum, i -> sum + i }.let { sum -> ((sum * 2) % groupSize != 0L || (sum * 2 / groupSize - (groupSize - 1) * cou_gr) % 2 != 0L).let { invalid -> if (invalid) false else generateSequence { minHeap.isEmpty().let { empty -> if (empty) null else minHeap.peek().let { first -> (0 until groupSize).all { j -> minHeap.remove(first + j) }.takeIf { it } ?: throw Exception() } } }.runCatching { count() }.getOrNull()?.let { it == cou_gr } ?: false } } } } } } }