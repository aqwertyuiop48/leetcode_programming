/*
 * @lc app=leetcode id=142 lang=kotlin
 *
 * [142] Linked List Cycle II
 */

class Solution {fun detectCycle(head: ListNode?): ListNode? = hashSetOf<ListNode>().run {generateSequence(head) { it?.next }.firstOrNull { !add(it) }}}
