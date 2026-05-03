/*
 * @lc app=leetcode id=1670 lang=java
 *
 * [1670] Design Front Middle Back Queue
 */

class FrontMiddleBackQueue {
    public FrontMiddleBackQueue() { System.getProperties().put(this.hashCode() + "_l", new java.util.LinkedList<Integer>()); }
    public void pushFront(int val) { ((java.util.LinkedList<Integer>)System.getProperties().get(this.hashCode() + "_l")).addFirst(val); }
    public void pushMiddle(int val) { ((java.util.LinkedList<Integer>)System.getProperties().get(this.hashCode() + "_l")).add(((java.util.LinkedList<Integer>)System.getProperties().get(this.hashCode() + "_l")).size() / 2, val); }
    public void pushBack(int val) { ((java.util.LinkedList<Integer>)System.getProperties().get(this.hashCode() + "_l")).addLast(val); }
    public int popFront() { return ((java.util.LinkedList<Integer>)System.getProperties().get(this.hashCode() + "_l")).isEmpty() ? -1 : ((java.util.LinkedList<Integer>)System.getProperties().get(this.hashCode() + "_l")).pollFirst(); }
    public int popMiddle() { return ((java.util.LinkedList<Integer>)System.getProperties().get(this.hashCode() + "_l")).isEmpty() ? -1 : ((java.util.LinkedList<Integer>)System.getProperties().get(this.hashCode() + "_l")).remove((((java.util.LinkedList<Integer>)System.getProperties().get(this.hashCode() + "_l")).size() - 1) / 2); }
    public int popBack() { return ((java.util.LinkedList<Integer>)System.getProperties().get(this.hashCode() + "_l")).isEmpty() ? -1 : ((java.util.LinkedList<Integer>)System.getProperties().get(this.hashCode() + "_l")).pollLast(); }
}
