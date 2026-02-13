/*
 * @lc app=leetcode id=237 lang=kotlin
 *
 * [237] Delete Node in a Linked List
 */

class Solution {fun deleteNode(node: ListNode?) = node?.apply { generateSequence(this) { it.next?.takeIf { it.next != null } }.forEach { it.`val` = it.next!!.`val` } }?.let { generateSequence(it) { it.next }.lastOrNull { it.next != null }?.apply { `val` = next!!.`val`.also{next = null} } }}

