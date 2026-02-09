/*
 * @lc app=leetcode id=92 lang=kotlin
 *
 * [92] Reverse Linked List II
 */

class Solution { fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? = ListNode(0).apply { next = head }.let { dummy -> (1 until left).fold(dummy) { prev, _ -> prev.next!! }.let { prev -> (0 until right - left).fold(prev.next) { cur, _ -> cur?.next?.let { nextNode -> cur.apply { next = nextNode.next } .also { nextNode.next = prev.next } .also { prev.next = nextNode } }?.let { cur } } }.let { dummy.next } } }
