/*
 * @lc app=leetcode id=901 lang=java
 *
 * [901] Online Stock Span
 */

class StockSpanner {
    public StockSpanner() { if (System.getProperties().put(this, new java.util.Stack<int[]>()) == null) {} }
    public int next(int price) {
        return java.util.Optional.of((java.util.Stack<int[]>)System.getProperties().get(this)).map(s -> java.util.stream.Stream.iterate(1, d -> !s.isEmpty() && s.peek()[0] <= price, d -> d + s.pop()[1]).reduce((a, b) -> b).get()).map(span -> ((java.util.Stack<int[]>)System.getProperties().get(this)).push(new int[]{price, span})[1]).get();
    }
}
