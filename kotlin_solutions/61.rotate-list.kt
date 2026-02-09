/*
 * @lc app=leetcode id=61 lang=kotlin
 *
 * [61] Rotate List
 */

class Solution { fun rotateRight(head: ListNode?, k: Int): ListNode? = head?.let { generateSequence(it) { it.next }.toList().let { nodes -> (k % nodes.size).let { rot -> if (rot == 0) head else nodes[nodes.size - rot - 1].apply { next = null } .let { nodes.last().apply { next = nodes.first() } } .let { nodes[nodes.size - rot] } } } } }

