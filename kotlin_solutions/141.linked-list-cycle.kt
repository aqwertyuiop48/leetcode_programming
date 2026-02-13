/*
 * @lc app=leetcode id=141 lang=kotlin
 *
 * [141] Linked List Cycle
 */

class Solution {fun hasCycle(head: ListNode?): Boolean =generateSequence(head to head?.next) { (slow, fast) ->fast?.next?.next?.let { slow?.next to it }}.any { (slow, fast) -> slow == fast && slow != null }}

