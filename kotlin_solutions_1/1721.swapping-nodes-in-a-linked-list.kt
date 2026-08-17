/*
 * @lc app=leetcode id=1721 lang=kotlin
 *
 * [1721] Swapping Nodes in a Linked List
 */

class Solution { fun swapNodes(head: ListNode?, k: Int): ListNode? = generateSequence(head) { it.next }.toList().let { list -> list[k - 1].let { a -> list[list.size - k].let { b -> a.`val`.also { a.`val` = b.`val` }.also { b.`val` = it } } } }.let { head } }