/*
 * @lc app=leetcode id=445 lang=java
 *
 * [445] Add Two Numbers II
 */

import java.math.*;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return Optional.of(Stream.of(l1, l2).map(node -> Stream.iterate(node, Objects::nonNull, n -> n.next).map(n -> String.valueOf(n.val)).collect(Collectors.joining())).map(BigInteger::new).reduce(BigInteger.ZERO, BigInteger::add).toString()).map(s -> new StringBuilder(s).reverse().toString().chars().mapToObj(c -> c - '0').reduce((ListNode)null, (head, val) -> new ListNode(val, head), (a, b) -> a)).get();
    }
}
