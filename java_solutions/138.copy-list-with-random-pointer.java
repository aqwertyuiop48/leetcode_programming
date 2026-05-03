/*
 * @lc app=leetcode id=138 lang=java
 *
 * [138] Copy List with Random Pointer
 */

class Solution {
    public Node copyRandomList(Node head) {
        return head == null ? null : java.util.stream.Stream.of(new java.util.IdentityHashMap<Node, Node>()).map(m -> java.util.stream.Stream.<Node>iterate(head, n -> n != null, n -> n.next).peek(n -> m.put(n, new Node(n.val))).count() > -1 ? java.util.stream.Stream.<Node>iterate(head, n -> n != null, n -> n.next).peek(n -> m.get(n).next = m.get(n.next)).peek(n -> m.get(n).random = m.get(n.random)).count() > -1 ? m.get(head) : null : null).findFirst().get();
    }
}
