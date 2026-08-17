/*
 * @lc app=leetcode id=1019 lang=kotlin
 *
 * [1019] Next Greater Node In Linked List
 */

class Solution {
    fun nextLargerNodes(head: ListNode?): IntArray = generateSequence(head) { it.next }.map { it.`val` }.toList().let { list -> IntArray(list.size).also { ans -> list.indices.fold(intArrayOf()) { st, i -> generateSequence(st) { s -> if (s.isNotEmpty() && list[s.last()] < list[i]) s.copyOf(s.size - 1).also { ans[s.last()] = list[i] } else null }.last().let { newSt -> newSt + i } } } }
}