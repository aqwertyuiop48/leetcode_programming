/*
 * @lc app=leetcode id=206 lang=kotlin
 *
 * [206] Reverse Linked List
 */

class Solution {fun reverseList(head: ListNode?): ListNode? =generateSequence(null as ListNode? to head) { (prev, curr) ->curr?.next?.let { next -> curr.also { it.next = prev } to next }?: curr?.let { it.also { it.next = prev } to null }}.last().first}

