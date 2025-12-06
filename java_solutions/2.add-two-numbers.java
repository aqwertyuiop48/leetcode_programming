/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
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
// semicolons : 1
import java.math.*;
class Solution { public ListNode addTwoNumbers(ListNode l1, ListNode l2) { return Stream.of(new ListNode()) .peek(d -> Arrays.stream(new StringBuilder(new BigInteger(Stream.iterate(l1, Objects::nonNull, x -> x.next).map(x -> String.valueOf(x.val)).reduce("", (a, b) -> b + a, String::concat)).add(new BigInteger(Stream.iterate(l2, Objects::nonNull, x -> x.next).map(x -> String.valueOf(x.val)).reduce("", (a, b) -> b + a, String::concat))).toString()).reverse().toString().split("")).map(s -> new BigInteger(s)).reduce(d, (c, v) -> c.next = new ListNode(v.intValue()), (a, b) -> b)) .map(d -> d.next) .findFirst() .get(); } }
// @lc code=end

