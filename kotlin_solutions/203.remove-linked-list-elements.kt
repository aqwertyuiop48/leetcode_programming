/*
 * @lc app=leetcode id=203 lang=kotlin
 *
 * [203] Remove Linked List Elements
 */

class Solution { fun removeElements(head: ListNode?, `val`: Int): ListNode? = ListNode(0).apply { next = head }.let { dummy -> generateSequence(dummy) { it.next } .forEach { node -> while (node.next?.`val` == `val`) node.next = node.next?.next } .run{dummy.next} } }

