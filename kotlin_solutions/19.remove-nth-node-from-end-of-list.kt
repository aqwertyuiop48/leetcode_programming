/*
 * @lc app=leetcode id=19 lang=kotlin
 *
 * [19] Remove Nth Node From End of List
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
class Solution { fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? = ListNode(0).apply { next = head }.let { dummy -> (0..n).fold(dummy as ListNode?) { acc, _ -> acc?.next }.let { first -> generateSequence(dummy as ListNode? to first) { (second, f) -> f?.let { (second?.next to it.next) } }.first { (_, f) -> f == null }.first.also { it?.next = it?.next?.next } }.let { dummy.next } } }
// @lc code=end

