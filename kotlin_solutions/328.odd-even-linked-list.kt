/*
 * @lc app=leetcode id=328 lang=kotlin
 *
 * [328] Odd Even Linked List
 */

class Solution {fun oddEvenList(head: ListNode?) = head?.let { generateSequence(Triple(head, head.next, head.next)) { (odd, even, evenHead) -> even?.next?.let { nextOdd -> Triple(nextOdd, nextOdd.next, evenHead).also { odd.next = nextOdd }.also { even.next = nextOdd.next } } }.last().also { (odd, _, evenHead) -> odd.next = evenHead }.let { head } }}
