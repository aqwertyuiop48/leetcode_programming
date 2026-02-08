/*
 * @lc app=leetcode id=25 lang=kotlin
 *
 * [25] Reverse Nodes in k-Group
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
class Solution {fun reverseKGroup(head: ListNode?, k: Int): ListNode? = head?.let {generateSequence(it) { it.next }.toList().chunked(k).map { if (it.size == k) it.asReversed() else it }.flatten().let { nodes -> nodes.also { it.zipWithNext().forEach { (a, b) -> a.next = b } }.also { it.last().next = null }.first() }}}
// @lc code=end

