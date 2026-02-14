/*
 * @lc app=leetcode id=546 lang=kotlin
 *
 * [546] Remove Boxes
 */

class Solution { fun removeBoxes(boxes: IntArray): Int = mutableMapOf<Triple<Int, Int, Int>, Int>().let { cache -> DeepRecursiveFunction<Triple<Int, Int, Int>, Int> { (start, end, sameRightBox) -> generateSequence(Pair(end, sameRightBox)) { (e, s) -> if (e > start && boxes[e - 1] == boxes[e]) Pair(e - 1, s + 1) else null } .last().let { (e, s) -> (e - start + 1).takeIf { it > 0 }?.let { length -> if (length == 1) (s + 1) * (s + 1) else cache.getOrPut(Triple(start, e, s)) { (start until e - 1).fold(callRecursive(Triple(start, e - 1, 0)) + (s + 1) * (s + 1)) { result, mid -> if (boxes[mid] == boxes[e]) maxOf(result, callRecursive(Triple(start, mid, s + 1)) + callRecursive(Triple(mid + 1, e - 1, 0))) else result } } } ?: 0 } }.invoke(Triple(0, boxes.lastIndex, 0)) } }
