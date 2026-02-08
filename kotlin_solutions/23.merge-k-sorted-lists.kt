/*
 * @lc app=leetcode id=23 lang=kotlin
 *
 * [23] Merge k Sorted Lists
 */

// @lc code=start
/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {fun mergeKLists(lists: Array<ListNode?>): ListNode? =PriorityQueue<ListNode>(compareBy { it.`val` }).apply {lists.filterNotNull().forEach { add(it) }}.let { queue ->ListNode(0).let { dummy ->generateSequence {if (queue.isEmpty()) null else queue.poll().also { it.next?.let(queue::add) }}.fold(dummy) { current, node -> current.apply { next = node }.next!! }.let{dummy.next}}}}
// @lc code=end

