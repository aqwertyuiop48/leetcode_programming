/*
 * @lc app=leetcode id=147 lang=kotlin
 *
 * [147] Insertion Sort List
 */

class Solution { fun insertionSortList(head: ListNode?): ListNode? = head?.let { generateSequence(it) { it.next }.count().let { length -> if (length <= 1) it else generateSequence(it to it) { (slow, fast) -> fast.next?.next?.let { slow.next to it } }.last().first.let { mid -> mid.next.also { mid.next = null }.let { right -> DeepRecursiveFunction<Pair<ListNode?, ListNode?>, ListNode?> { (l1, l2) -> if (l1 == null) l2 else if (l2 == null) l1 else if (l1.`val` < l2.`val`) l1.apply { next = callRecursive(next to l2) } else l2.apply { next = callRecursive(l1 to next) } }.invoke(insertionSortList(it) to insertionSortList(right)) } } } } }