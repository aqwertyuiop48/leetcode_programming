/*
 * @lc app=leetcode id=61 lang=java
 *
 * [61] Rotate List
 */

// semicolons : 1
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        return Optional.ofNullable(head).map(h -> Optional.of(Stream.iterate(h, Objects::nonNull, n -> n.next).collect(Collectors.toList())).filter(l -> l.size() > 0).map(nodes -> Stream.concat(nodes.subList(nodes.size() - k % nodes.size(), nodes.size()).stream(), nodes.subList(0, nodes.size() - k % nodes.size()).stream()).collect(Collectors.toList())).map(rotated -> rotated.stream().map(n -> new ListNode(n.val)).reduce((a, b) -> Stream.iterate(a, Objects::nonNull, n -> n.next).filter(n -> n.next == null).findFirst().map(tail -> tail.next = b).map(x -> a).orElse(a)).orElse(null)).orElse(null)).orElse(null);
    }
}
