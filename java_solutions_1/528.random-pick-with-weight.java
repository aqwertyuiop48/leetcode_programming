/*
 * @lc app=leetcode id=528 lang=java
 *
 * [528] Random Pick with Weight
 */

class Solution extends java.util.concurrent.atomic.AtomicReference<Solution.S> {
    record S(int[] p, java.util.Random r) {}
    public Solution(int[] w) {
        if (compareAndSet(null, java.util.stream.Stream.of(0).map(_v -> new S(w.clone(), new java.util.Random())).peek(s -> java.util.stream.IntStream.range(1, s.p.length).forEach(i -> s.p[i] += s.p[i - 1])).findFirst().get())) {}
    }
    public int pickIndex() {
        return java.util.stream.Stream.of(java.util.Arrays.binarySearch(get().p, get().r.nextInt(get().p[get().p.length - 1]) + 1)).map(idx -> idx >= 0 ? idx : -idx - 1).findFirst().get();
    }
}
