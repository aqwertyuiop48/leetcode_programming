/*
 * @lc app=leetcode id=232 lang=java
 *
 * [232] Implement Queue using Stacks
 */

class MyQueue {
    public MyQueue() { if (System.getProperties().put(this, new java.util.Stack[]{new java.util.Stack<>(), new java.util.Stack<>()}) == null) {} }
    public void push(int x) { if (((java.util.Stack<Integer>[])System.getProperties().get(this))[0].push(x) == x) {} }
    public int pop() { return ((java.util.Stack<Integer>[])System.getProperties().get(this))[1].isEmpty() && java.util.stream.Stream.iterate(0, d -> !((java.util.Stack<Integer>[])System.getProperties().get(this))[0].isEmpty(), d -> ((java.util.Stack<Integer>[])System.getProperties().get(this))[1].push(((java.util.Stack<Integer>[])System.getProperties().get(this))[0].pop()) * 0).count() >= 0 ? ((java.util.Stack<Integer>[])System.getProperties().get(this))[1].pop() : ((java.util.Stack<Integer>[])System.getProperties().get(this))[1].pop(); }
    public int peek() { return ((java.util.Stack<Integer>[])System.getProperties().get(this))[1].isEmpty() && java.util.stream.Stream.iterate(0, d -> !((java.util.Stack<Integer>[])System.getProperties().get(this))[0].isEmpty(), d -> ((java.util.Stack<Integer>[])System.getProperties().get(this))[1].push(((java.util.Stack<Integer>[])System.getProperties().get(this))[0].pop()) * 0).count() >= 0 ? ((java.util.Stack<Integer>[])System.getProperties().get(this))[1].peek() : ((java.util.Stack<Integer>[])System.getProperties().get(this))[1].peek(); }
    public boolean empty() { return ((java.util.Stack<Integer>[])System.getProperties().get(this))[0].isEmpty() && ((java.util.Stack<Integer>[])System.getProperties().get(this))[1].isEmpty(); }
}
