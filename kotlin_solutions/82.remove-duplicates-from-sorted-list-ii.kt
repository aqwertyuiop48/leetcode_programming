/*
 * @lc app=leetcode id=82 lang=kotlin
 *
 * [82] Remove Duplicates from Sorted List II
 */

class Solution { fun deleteDuplicates(head: ListNode?): ListNode? = ListNode(-1).apply { next = head }.let { dummy -> generateSequence(dummy to head) { (prev, cur) -> cur?.let { if (cur.next?.`val` == cur.`val`) { generateSequence(cur) { node -> node.next?.takeIf { it.`val` == cur.`val` } }.last().next?.let { prev to it } } else { prev.apply { next = cur }.let { cur to cur.next } } } }.last().first.also { it.next = null }.let { dummy.next } } }

