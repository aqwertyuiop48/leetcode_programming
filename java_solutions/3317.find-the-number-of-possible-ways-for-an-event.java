/*
 * @lc app=leetcode id=3317 lang=java
 *
 * [3317] Find the Number of Possible Ways for an Event
 */

class Solution { public int numberOfWays(int n, int x, int y) { return (int)(long) ((Function<long[], Long>) S_n -> IntStream.rangeClosed(1, Math.min(n, x)).boxed().reduce(new long[]{1L, 1L, 0L}, (state, i) -> new long[]{ (state[0] * (x - i + 1)) % 1000000007L, (state[1] * y) % 1000000007L, (state[2] + (((state[0] * (x - i + 1)) % 1000000007L) * S_n[i] % 1000000007L) * ((state[1] * y) % 1000000007L) % 1000000007L) % 1000000007L }, (a, b) -> a)[2]).apply(IntStream.range(0, n).boxed().reduce(new long[]{1L}, (r, idx) -> IntStream.range(0, r.length + 1).mapToLong(j -> ((j == 0 ? 0 : r[j - 1]) + (j < r.length ? r[j] * j : 0)) % 1000000007L).toArray(), (a, b) -> a)); } }
