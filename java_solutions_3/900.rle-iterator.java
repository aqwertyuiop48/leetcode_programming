/*
 * @lc app=leetcode id=900 lang=java
 *
 * [900] RLE Iterator
 */

class RLEIterator extends java.util.concurrent.atomic.AtomicReference<RLEIterator.St> {
    record St(int[] e, int[] p) {}

    public RLEIterator(int[] encoding) {
        if (compareAndSet(null, new St(encoding, new int[1]))) {}
    }

    public int next(int n) {
        return get() instanceof St(var e, var p) && new int[]{n} instanceof int[] r
            && java.util.stream.Stream.of(0).peek(z -> {
                while (p[0] < e.length && e[p[0]] < r[0] && (r[0] -= e[p[0]]) >= 0 && (p[0] += 2) > 0) {}
            }).anyMatch(z -> true)
            ? (p[0] < e.length ? ((e[p[0]] -= r[0]) >= 0 ? e[p[0] + 1] : -1) : -1) : -1;
    }
}
