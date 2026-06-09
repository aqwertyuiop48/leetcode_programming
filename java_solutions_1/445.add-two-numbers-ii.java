/*
 * @lc app=leetcode id=445 lang=java
 *
 * [445] Add Two Numbers II
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return java.util.stream.Stream.of(0).map(_v -> new Object[]{new java.util.Stack<Integer>(), new java.util.Stack<Integer>(), new int[]{0}}).peek(a -> java.util.stream.Stream.iterate(l1, n -> n != null, n -> n.next).forEach(n -> ((java.util.Stack<Integer>) a[0]).push(n.val))).peek(a -> java.util.stream.Stream.iterate(l2, n -> n != null, n -> n.next).forEach(n -> ((java.util.Stack<Integer>) a[1]).push(n.val))).map(a -> java.util.stream.Stream.generate(() -> 0).takeWhile(_v -> !((java.util.Stack<Integer>) a[0]).isEmpty() || !((java.util.Stack<Integer>) a[1]).isEmpty() || ((int[]) a[2])[0] > 0).reduce((ListNode) null, (head, _v) -> java.util.stream.Stream.of((((java.util.Stack<Integer>) a[0]).isEmpty() ? 0 : ((java.util.Stack<Integer>) a[0]).pop()) + (((java.util.Stack<Integer>) a[1]).isEmpty() ? 0 : ((java.util.Stack<Integer>) a[1]).pop()) + ((int[]) a[2])[0]).map(sum -> java.util.stream.Stream.of(new ListNode(sum % 10)).peek(n -> n.next = head).peek(n -> ((int[]) a[2])[0] = sum / 10).findFirst().get()).findFirst().get(), (n1, n2) -> n2)).findFirst().get();
    }
}
