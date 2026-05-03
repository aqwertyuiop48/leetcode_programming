/*
 * @lc app=leetcode id=473 lang=java
 *
 * [473] Matchsticks to Square
 */

record Solution() {
    public boolean makesquare(int[] ms) {
        return ms.length >= 4 && java.util.stream.IntStream.of(ms).sum() % 4 == 0 && java.util.Optional.of(java.util.stream.IntStream.of(ms).sum() / 4).map(t -> java.util.stream.IntStream.range(0, 1 << ms.length).boxed().reduce(new int[1 << ms.length], (dp, m) -> java.util.stream.IntStream.range(0, ms.length).filter(i -> (m & (1 << i)) != 0 && dp[m ^ (1 << i)] >= 0 && dp[m ^ (1 << i)] + ms[i] <= t).findFirst().map(i -> java.util.stream.Stream.of(dp).peek(a -> a[m] = (a[m ^ (1 << i)] + ms[i]) % t).findFirst().get()).orElseGet(() -> java.util.stream.Stream.of(dp).peek(a -> a[m] = -1).findFirst().get()), (a, b) -> a)[(1 << ms.length) - 1] == 0).get();
    }
}
