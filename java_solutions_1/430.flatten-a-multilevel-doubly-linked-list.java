/*
 * @lc app=leetcode id=430 lang=java
 *
 * [430] Flatten a Multilevel Doubly Linked List
 */

class Solution {
    public Node flatten(Node head) {
        return head == null ? null : java.util.stream.Stream.of(0).map(_v -> new Object[]{new java.util.ArrayList<Node>(), new java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<Node>>()}).peek(a -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<Node>>) a[1]).set(n -> java.util.stream.Stream.of(n).filter(x -> x != null).peek(x -> ((java.util.List<Node>) a[0]).add(x)).peek(x -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<Node>>) a[1]).get().accept(x.child)).forEach(x -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<Node>>) a[1]).get().accept(x.next)))).peek(a -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<Node>>) a[1]).get().accept(head)).map(a -> (java.util.List<Node>) a[0]).peek(list -> java.util.stream.IntStream.range(0, list.size()).forEach(i -> java.util.stream.Stream.of(list.get(i)).peek(n -> n.prev = i == 0 ? null : list.get(i - 1)).peek(n -> n.next = i == list.size() - 1 ? null : list.get(i + 1)).forEach(n -> n.child = null))).map(list -> list.get(0)).findFirst().get();
    }
}
