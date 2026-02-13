/*
 * @lc app=leetcode id=382 lang=kotlin
 *
 * [382] Linked List Random Node
 */

class Solution(private val head: ListNode? = null, private val list: List<Int> = generateSequence(head) { it.next }.map { it.`val` }.toList()) { fun getRandom(): Int = list.random() }