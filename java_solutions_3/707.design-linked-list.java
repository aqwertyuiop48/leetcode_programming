/*
 * @lc app=leetcode id=707 lang=java
 *
 * [707] Design Linked List
 */

class MyLinkedList extends java.util.concurrent.atomic.AtomicReference<java.util.LinkedList<Integer>> {
    public MyLinkedList() {
        if (compareAndSet(null, new java.util.LinkedList<>())) {}
    }

    public int get(int index) {
        return index < 0 || index >= get().size() ? -1 : get().get(index);
    }

    public void addAtHead(int val) {
        if (get().addAll(0, java.util.List.of(val))) {}
    }

    public void addAtTail(int val) {
        if (get().add(val)) {}
    }

    public void addAtIndex(int index, int val) {
        if (index >= 0 && index <= get().size() && get().addAll(index, java.util.List.of(val))) {}
    }

    public void deleteAtIndex(int index) {
        if (index >= 0 && index < get().size() && get().remove(index) != null) {}
    }
}
