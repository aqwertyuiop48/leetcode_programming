/*
 * @lc app=leetcode id=86 lang=java
 *
 * [86] Partition List
 */

class Solution {
    public ListNode partition(ListNode head, int x) {
        return java.util.stream.Stream.of(java.util.stream.Stream.iterate(head, n -> n != null, n -> n.next).collect(java.util.stream.Collectors.toList())).map(l -> java.util.stream.Stream.concat(l.stream().filter(n -> n.val < x), l.stream().filter(n -> n.val >= x)).reduce((a, b) -> (a.next = b)).map(last -> (last.next = null) == null ? java.util.stream.Stream.concat(l.stream().filter(n -> n.val < x), l.stream().filter(n -> n.val >= x)).findFirst().orElse(null) : null).orElse(null)).findFirst().orElse(null);
    }
}
