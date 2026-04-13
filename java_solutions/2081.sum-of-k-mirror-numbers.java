/*
 * @lc app=leetcode id=2081 lang=java
 *
 * [2081] Sum of k-Mirror Numbers
 */

class Solution { public long kMirror(int k, int n) { return ((Function<long[], Long>) state -> LongStream.iterate(1, len -> state[0] > 0, len -> len * 10).reduce(0L, (acc, len) -> acc + IntStream.of(1, 0).mapToLong(odd -> LongStream.iterate(len, i -> state[0] > 0 && i < len * 10, i -> i + 1).reduce(0L, (a, i) -> ((LongUnaryOperator) p -> ((Function<String, Long>) s -> new StringBuilder(s).reverse().toString().equals(s) && state[0] > 0 ? (state[1] += p) * 0 + state[0]-- * 0 : 0L).apply(Long.toString(p, k))).applyAsLong(LongStream.iterate(odd == 1 ? i / 10 : i, x -> x > 0, x -> x / 10).reduce(i, (res, x) -> res * 10 + x % 10)))).sum()) * 0 == 0 ? state[1] : 0L).apply(new long[]{n, 0L}); } }
