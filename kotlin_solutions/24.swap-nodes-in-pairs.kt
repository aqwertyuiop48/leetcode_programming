/*
 * @lc app=leetcode id=24 lang=kotlin
 *
 * [24] Swap Nodes in Pairs
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
class Solution { fun swapPairs(head: ListNode?): ListNode? = head?.next?.let { node2 -> node2.also { it.next = head.apply { next = swapPairs(node2.next) } } } ?: head }
// @lc code=end

