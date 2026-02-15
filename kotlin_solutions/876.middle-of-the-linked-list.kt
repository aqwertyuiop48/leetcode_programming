/*
 * @lc app=leetcode id=876 lang=kotlin
 *
 * [876] Middle of the Linked List
 */

class Solution { fun middleNode(head: ListNode?, fast: ListNode? = head?.next): ListNode? = fast?.let { middleNode(head?.next, it.next?.next) } ?: head }
