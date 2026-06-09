/*
 * @lc app=leetcode id=382 lang=java
 *
 * [382] Linked List Random Node
 */

class Solution extends java.util.concurrent.atomic.AtomicReference<Solution.S> {
    record S(java.util.List<Integer> l, java.util.Random r) {}
    
    public Solution(ListNode head) { 
        if (compareAndSet(null, java.util.stream.Stream.of(new S(new java.util.ArrayList<>(), new java.util.Random())).peek(s -> java.util.stream.Stream.iterate(head, n -> n != null, n -> n.next).forEach(n -> s.l.add(n.val))).findFirst().get())) {} 
    }
    
    public int getRandom() { 
        return get().l.get(get().r.nextInt(get().l.size())); 
    }
}
