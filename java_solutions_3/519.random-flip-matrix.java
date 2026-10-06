/*
 * @lc app=leetcode id=519 lang=java
 *
 * [519] Random Flip Matrix
 */

class Solution extends java.util.concurrent.atomic.AtomicReference<Solution.St> {
    record St(java.util.Map<Integer, Integer> map, int[] st) {}

    public Solution(int m, int n) {
        if (compareAndSet(null, new St(new java.util.HashMap<>(), new int[]{m, n, m * n}))) {}
    }

    public int[] flip() {
        return get() instanceof St(var map, var st)
            ? java.util.stream.IntStream.of(java.util.concurrent.ThreadLocalRandom.current().nextInt(st[2]--))
                .mapToObj(r -> java.util.stream.IntStream.of(map.getOrDefault(r, r)).peek(v -> map.put(r, map.getOrDefault(st[2], st[2])))
                    .mapToObj(v -> new int[]{v / st[1], v % st[1]}).findFirst().get()).findFirst().get()
            : null;
    }

    public void reset() {
        if (get() instanceof St(var map, var st) && (map.keySet().removeIf(k -> true) | (st[2] = st[0] * st[1]) > 0)) {}
    }
}
