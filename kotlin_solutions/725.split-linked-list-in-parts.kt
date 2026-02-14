/*
 * @lc app=leetcode id=725 lang=kotlin
 *
 * [725] Split Linked List in Parts
 */

class Solution { fun splitListToParts(head: ListNode?, k: Int): Array<ListNode?> = generateSequence(head) { it.next }.count().let { len -> arrayOf(head).let { current -> Array(k) { i -> (len / k + if (i < len % k) 1 else 0).let { size -> current[0].also { (1 until size).fold(current[0]) { node, _ -> node?.next }?.apply { current[0] = next.also { next = null } } } } } } } }

