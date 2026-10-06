/*
 * @lc app=leetcode id=703 lang=java
 *
 * [703] Kth Largest Element in a Stream
 */

class KthLargest extends java.util.concurrent.atomic.AtomicReference<KthLargest.St> {
    record St(java.util.PriorityQueue<Integer> q, int k) {}

    public KthLargest(int k, int[] nums) {
        if (compareAndSet(null, new St(new java.util.PriorityQueue<>(), k)) && java.util.Arrays.stream(nums).allMatch(x -> add(x) > Integer.MIN_VALUE)) {}
    }

    public int add(int val) {
        return get() instanceof St(var q, var k) ? (q.offer(val) && q.size() > k && q.poll() != null ? q.peek() : q.peek()) : 0;
    }
}
