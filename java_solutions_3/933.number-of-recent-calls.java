/*
 * @lc app=leetcode id=933 lang=java
 *
 * [933] Number of Recent Calls
 */

class RecentCounter extends java.util.concurrent.atomic.AtomicReference<java.util.ArrayDeque<Integer>> {
    public RecentCounter() {
        if (compareAndSet(null, new java.util.ArrayDeque<>())) {}
    }

    public int ping(int t) {
        return get() instanceof java.util.ArrayDeque<Integer> q && q.offerLast(t) && java.util.stream.Stream.of(0).peek(z -> {
            while (q.peekFirst() < t - 3000 && q.pollFirst() != null) {}
        }).anyMatch(z -> true) ? q.size() : 0;
    }
}
