/*
 * @lc app=leetcode id=86 lang=kotlin
 *
 * [86] Partition List
 */

class Solution { fun partition(head: ListNode?, x: Int): ListNode? = ListNode(0).let { smallHead -> ListNode(0).let { bigHead -> generateSequence(Triple(head, smallHead, bigHead)) { (curr, currSmall, currBig) -> curr?.let { if (it.`val` < x) Triple(curr.next, currSmall.apply { next = curr }.next, currBig) else Triple(curr.next, currSmall, currBig.apply { next = curr }.next) } }.last().let { (_, currSmall, currBig) -> currBig.apply { next = null } .let { currSmall.apply { next = bigHead.next } } .let { smallHead.next } } } } }
