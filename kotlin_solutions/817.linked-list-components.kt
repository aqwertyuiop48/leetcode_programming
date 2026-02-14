/*
 * @lc app=leetcode id=817 lang=kotlin
 *
 * [817] Linked List Components
 */

class Solution { fun numComponents(head: ListNode?, nums: IntArray): Int = nums.toSet().let { set -> generateSequence(head) { it.next } .map { it.`val` in set } .zipWithNext() .count { (prev, curr) -> prev && !curr } + (generateSequence(head) { it.next }.lastOrNull()?.`val` in set).compareTo(false) } }
