/*
 * @lc app=leetcode id=1171 lang=kotlin
 *
 * [1171] Remove Zero Sum Consecutive Nodes from Linked List
 */

class Solution { fun removeZeroSumSublists(head: ListNode?): ListNode? = ListNode(0).apply { next = head }.let { dummy -> mutableMapOf<Int, ListNode>().also { map -> generateSequence(dummy to 0) { (n, s) -> n.next?.let { it to s + it.`val` } }.forEach { (n, s) -> map[s] = n } }.also { map -> generateSequence(dummy to 0) { (n, s) -> n.apply { next = map[s]?.next }.next?.let { it to s + it.`val` } }.lastOrNull() }.run { dummy.next } } }