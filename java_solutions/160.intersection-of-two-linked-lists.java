/*
 * @lc app=leetcode id=160 lang=java
 *
 * [160] Intersection of Two Linked Lists
 */

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        return Stream.iterate(headA, Objects::nonNull, n -> n.next) .collect(Collectors.collectingAndThen( Collectors.toSet(), set -> Stream.iterate(headB, Objects::nonNull, n -> n.next) .filter(set::contains) .findFirst() .orElse(null) ));
    }
}
