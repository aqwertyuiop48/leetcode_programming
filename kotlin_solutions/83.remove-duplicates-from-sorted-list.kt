/*
 * @lc app=leetcode id=83 lang=kotlin
 *
 * [83] Remove Duplicates from Sorted List
 */

class Solution {fun deleteDuplicates(head: ListNode?): ListNode? = head?.apply {generateSequence(this) { cur ->cur.next?.let {if (it.`val` == cur.`val`) cur.apply { next = next?.next }else it}}.last()}}

