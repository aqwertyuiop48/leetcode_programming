/*
 * @lc app=leetcode id=445 lang=kotlin
 *
 * [445] Add Two Numbers II
 */

class Solution { fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? = (l1.toList().joinToString("") to l2.toList().joinToString("")).let { (a, b) -> (a.toBigInteger() + b.toBigInteger()).toString().foldRight(null as ListNode?) { d, acc -> ListNode(d - '0').apply { next = acc } } } fun ListNode?.toList(): List<Int> = generateSequence(this) { it.next }.map { it.`val` }.toList() }

