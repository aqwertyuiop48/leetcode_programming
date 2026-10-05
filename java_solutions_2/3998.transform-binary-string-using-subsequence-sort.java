/*
 * @lc app=leetcode id=3998 lang=java
 *
 * [3998] Transform Binary String Using Subsequence Sort
 */

class Solution {
    public boolean[] transformStr(String s, String[] a) {
        return java.util.stream.Stream.of(java.util.stream.IntStream.range(0, s.length()).filter(i -> s.charAt(i) == '0').toArray())
            .map(p -> java.util.stream.IntStream.range(0, a.length)
                .boxed()
                .reduce(new boolean[a.length], (res, idx) -> java.util.stream.Stream.of(res)
                    .peek(r -> r[idx] = java.util.stream.Stream.of((int) a[idx].chars().filter(c -> c == '0').count())
                        .flatMap(cz -> java.util.stream.Stream.of((int) a[idx].chars().filter(c -> c == '?').count())
                            .map(q -> cz <= p.length && cz + q >= p.length && java.util.stream.Stream.of(
                                    java.util.stream.IntStream.concat(
                                        java.util.stream.IntStream.range(0, a[idx].length()).filter(i -> a[idx].charAt(i) == '0'),
                                        java.util.stream.IntStream.range(0, a[idx].length()).filter(i -> a[idx].charAt(i) == '?').limit(p.length - cz)
                                    ).sorted().toArray()
                                )
                                .map(v -> java.util.stream.IntStream.range(0, p.length).allMatch(i -> p[i] >= v[i]))
                                .findFirst().get()
                            )
                        )
                        .findFirst().get()
                    )
                    .findFirst().get(),
                    (r1, r2) -> r1
                )
            )
            .findFirst().get();
    }
}
