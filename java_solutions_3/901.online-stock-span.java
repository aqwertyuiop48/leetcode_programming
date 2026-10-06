/*
 * @lc app=leetcode id=901 lang=java
 *
 * [901] Online Stock Span
 */

class StockSpanner extends java.util.concurrent.atomic.AtomicReference<java.util.ArrayDeque<int[]>> {
    public StockSpanner() {
        if (compareAndSet(null, new java.util.ArrayDeque<>())) {}
    }

    public int next(int price) {
        return get() instanceof java.util.ArrayDeque<int[]> st && new int[]{1} instanceof int[] s
            && java.util.stream.Stream.of(0).peek(z -> {
                while (!st.isEmpty() && st.peekFirst()[0] <= price && (s[0] += st.pollFirst()[1]) > 0) {}
            }).anyMatch(z -> true) && st.offerFirst(new int[]{price, s[0]})
            ? s[0] : 0;
    }
}
