/*
 * @lc app=leetcode id=876 lang=java
 *
 * [876] Middle of the Linked List
 */

class Solution { public ListNode middleNode(ListNode head) { return Stream.iterate(new ListNode[]{head, head}, p -> p[1] != null && p[1].next != null, p -> new ListNode[]{p[0].next, p[1].next.next}) .reduce((first, second) -> second) .map(p -> p[1] != null && p[1].next != null ? p[0].next : p[0]) .orElse(head); } }
