/*
 * @lc app=leetcode id=2095 lang=kotlin
 *
 * [2095] Delete the Middle Node of a Linked List
 */
class Solution { fun deleteMiddle(head: ListNode?): ListNode? = if (head?.next == null) null else head.also { kotlin.DeepRecursiveFunction<Pair<ListNode, ListNode?>, Unit> { (slow, fast) -> if (fast?.next != null) callRecursive(slow.next!! to fast.next!!.next) else slow.next = slow.next?.next }.invoke(head to head.next?.next) } }