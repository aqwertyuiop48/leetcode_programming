/*
 * @lc app=leetcode id=21 lang=kotlin
 *
 * [21] Merge Two Sorted Lists
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
class Solution { fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? = ListNode(0).let { dummy -> generateSequence(Triple(l1, l2, dummy)) { (n1, n2, curr) -> (n1 != null || n2 != null).takeIf { it }?.let { (if (n1 == null) n2!!.`val` to (n1 to n2.next) else if (n2 == null) n1.`val` to (n1.next to n2) else if (n1.`val` < n2.`val`) n1.`val` to (n1.next to n2) else n2.`val` to (n1 to n2.next)).let { (value, nodes) -> ListNode(value).also { curr.next = it }.let { Triple(nodes.first, nodes.second, it) } } } }.last().let { dummy.next } } }
// @lc code=end

