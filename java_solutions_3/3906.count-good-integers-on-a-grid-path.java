/*
 * @lc app=leetcode id=3906 lang=java
 *
 * [3906] Count Good Integers on a Grid Path
 */

class Solution {
    public long countGoodIntegersOnPath(long l, long r, String directions) {
        return ((java.util.function.LongUnaryOperator) X -> X < 0 ? 0 : String.format("%016d", X) instanceof String ds
                && directions.chars().boxed().reduce(java.util.List.of(0), (l0, c) -> java.util.stream.Stream.concat(l0.stream(), java.util.stream.Stream.of(l0.get(l0.size() - 1) + (c == 'D' ? 4 : 1))).toList(), (a, b) -> a) instanceof java.util.List<Integer> path
                ? java.util.Arrays.stream(java.util.stream.IntStream.range(0, 16).boxed().reduce(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    (st, pos) -> new long[20] instanceof long[] ns
                        && java.util.stream.IntStream.range(0, 200).filter(k -> st[k / 10] > 0 && k % 10 <= (k / 100 == 1 ? ds.charAt(pos) - '0' : 9) && (!path.contains(pos) || k % 10 >= k / 10 % 10))
                            .peek(k -> ns[(k / 100 == 1 && k % 10 == ds.charAt(pos) - '0' ? 10 : 0) + (path.contains(pos) ? k % 10 : k / 10 % 10)] += st[k / 10]).allMatch(x -> true)
                        ? ns : null, (a, b) -> a)).sum()
                : 0) instanceof java.util.function.LongUnaryOperator count
            ? count.applyAsLong(r) - count.applyAsLong(l - 1) : 0;
    }
}
