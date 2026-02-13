/*
 * @lc app=leetcode id=160 lang=kotlin
 *
 * [160] Intersection of Two Linked Lists
 */

class Solution { fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? = generateSequence(headA to headB) { (currA, currB) -> (currA != currB).takeIf { it }?.let { (if (currA == null) headB else currA.next) to (if (currB == null) headA else currB.next) } }.last().first }

