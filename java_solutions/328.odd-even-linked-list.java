/*
 * @lc app=leetcode id=328 lang=java
 *
 * [328] Odd Even Linked List
 */

class Solution {
    public ListNode oddEvenList(ListNode head) {
        return Optional.ofNullable(head).map(h -> Stream.iterate(h, n -> n != null, n -> n.next).map(n -> n.val).collect(Collectors.toList())).map(li -> Stream.concat(IntStream.range(0, li.size()).filter(i -> i % 2 == 0).mapToObj(li::get), IntStream.range(0, li.size()).filter(i -> i % 2 == 1).mapToObj(li::get)).collect(Collectors.collectingAndThen(Collectors.toList(), list -> list.reversed().stream().reduce((ListNode)null, (next, val) -> new ListNode(val, next), (a, b) -> b)))).orElse(null);
    }
}
