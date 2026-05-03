/*
 * @lc app=leetcode id=787 lang=java
 *
 * [787] Cheapest Flights Within K Stops
 */

record Solution() {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        return java.util.Optional.of(java.util.stream.IntStream.generate(() -> 1000000).limit(n).toArray()).map(d -> java.util.stream.Stream.of(d).peek(arr -> arr[src] = 0).findFirst().get()).map(d -> java.util.stream.IntStream.rangeClosed(0, k).boxed().reduce(d, (curr, i) -> java.util.Arrays.stream(flights).reduce(java.util.Arrays.copyOf(curr, n), (next, f) -> java.util.stream.Stream.of(next).peek(arr -> arr[f[1]] = Math.min(arr[f[1]], curr[f[0]] + f[2])).findFirst().get(), (a, b) -> a), (a, b) -> a)[dst]).map(res -> res >= 1000000 ? -1 : res).get();
    }
}
