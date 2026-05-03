/*
 * @lc app=leetcode id=430 lang=java
 *
 * [430] Flatten a Multilevel Doubly Linked List
 */

record Solution() {
    public Node flatten(Node head) {
        return java.util.Optional.ofNullable(head).map(h -> java.util.stream.Stream.iterate(h, n -> n != null, n -> n.child != null ? java.util.stream.Stream.of(n).peek(curr -> java.util.Optional.ofNullable(curr.next).ifPresent(nxt -> java.util.stream.Stream.iterate(curr.child, tail -> tail.next != null, tail -> tail.next).reduce((a, b) -> b).get().next = nxt)).peek(curr -> java.util.Optional.ofNullable(curr.next).ifPresent(nxt -> nxt.prev = java.util.stream.Stream.iterate(curr.child, tail -> tail.next != null, tail -> tail.next).reduce((a, b) -> b).get())).peek(curr -> curr.next = curr.child).peek(curr -> curr.child.prev = curr).peek(curr -> curr.child = null).findFirst().get().next : n.next).count() >= 0 ? h : h).orElse(null);
    }
}
