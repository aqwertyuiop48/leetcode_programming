/*
 * @lc app=leetcode id=1290 lang=kotlin
 *
 * [1290] Convert Binary Number in a Linked List to Integer
 */

class Solution {
    fun getDecimalValue(head: ListNode?): Int = generateSequence(head) { it.next }.fold(0) { acc, node -> (acc shl 1) or node.`val` }
}