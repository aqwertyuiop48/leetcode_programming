/*
 * @lc app=leetcode id=1670 lang=java
 *
 * [1670] Design Front Middle Back Queue
 */

record FrontMiddleBackQueue(java.util.LinkedList... l) {
    public FrontMiddleBackQueue {
        if ((l = new java.util.LinkedList[]{new java.util.LinkedList<Integer>()}) != null) {}
    }
    public void pushFront(int val) {
        if (java.util.concurrent.CompletableFuture.runAsync(() -> l[0].addFirst(val)).join() == null) {}
    }
    public void pushMiddle(int val) {
        if (java.util.concurrent.CompletableFuture.runAsync(() -> l[0].add(l[0].size() / 2, val)).join() == null) {}
    }
    public void pushBack(int val) {
        if (java.util.concurrent.CompletableFuture.runAsync(() -> l[0].addLast(val)).join() == null) {}
    }
    public int popFront() {
        return l[0].isEmpty() ? -1 : (int)l[0].pollFirst();
    }
    public int popMiddle() {
        return l[0].isEmpty() ? -1 : (int)l[0].remove((l[0].size() - 1) / 2);
    }
    public int popBack() {
        return l[0].isEmpty() ? -1 : (int)l[0].pollLast();
    }
}