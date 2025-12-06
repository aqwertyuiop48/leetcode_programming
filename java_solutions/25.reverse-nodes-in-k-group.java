/*
 * @lc app=leetcode id=25 lang=java
 *
 * [25] Reverse Nodes in k-Group
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution { public ListNode reverseKGroup(ListNode head, int k) { return Optional.of(Stream.iterate(head, Objects::nonNull, n -> n.next).map(n -> n.val).toList()) .map(list -> Stream.concat( IntStream.range(0, list.size() / k).flatMap(g -> IntStream.rangeClosed(1, k).map(i -> g * k + k - i)).mapToObj(list::get), IntStream.range(list.size() / k * k, list.size()).mapToObj(list::get) ).reduce( Optional.of(new ListNode()).map(d -> new ListNode[]{d, d}).orElse(new ListNode[]{new ListNode(), new ListNode()}), (acc, v) -> Stream.of(new ListNode(v)) .peek(node -> acc[1].next = node) .peek(node -> acc[1] = node) .map(node -> acc) .findFirst() .orElse(acc), (a, b) -> b )[0].next) .orElse(null); } }
// @lc code=end

