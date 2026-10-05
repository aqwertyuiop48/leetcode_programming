/*
 * @lc app=leetcode id=3957 lang=java
 *
 * [3957] Maximum Sum of M Non-Overlapping Subarrays II
 */

class Solution {
    public long maximumSum(int[] a, int m, int l, int r) {
        return Optional.of(a.length).map(n ->
            Optional.of(Stream.of(new long[n + 1]).peek(pp -> IntStream.range(0, n).forEach(i -> pp[i + 1] = pp[i] + a[i])).findFirst().get()).map(p ->
                Optional.<LongFunction<long[]>>of(x ->
                    Optional.of(new long[n + 1]).map(d ->
                        Optional.of(new int[n + 1]).map(k ->
                            Optional.of(new int[n + 1]).map(q ->
                                Optional.of(new int[]{1, 0, 0, 0}).map(s ->
                                    Optional.of(new long[2]).map(c ->
                                        Optional.of(LongStream.generate(() -> 0L).takeWhile(z -> s[0] <= n).map(z ->
                                            s[1] == 0
                                                ? (s[0] < l ? (s[1] = 1)
                                                    : s[2] < s[3] && (d[s[0] - l] - p[s[0] - l] > d[q[s[3] - 1]] - p[q[s[3] - 1]]
                                                        || (d[s[0] - l] - p[s[0] - l] == d[q[s[3] - 1]] - p[q[s[3] - 1]] && k[s[0] - l] >= k[q[s[3] - 1]]))
                                                        ? --s[3]
                                                        : (q[s[3]++] = s[0] - l) * 0 + (s[1] = 1))
                                            : s[1] == 1
                                                ? (s[2] < s[3] && q[s[2]] < s[0] - r ? ++s[2] : (s[1] = 2))
                                            : s[1] == 2
                                                ? (c[0] = s[2] < s[3] ? d[q[s[2]]] - p[q[s[2]]] + p[s[0]] - x : Long.MIN_VALUE) * 0
                                                    + (c[1] = s[2] < s[3] ? k[q[s[2]]] + 1 : 0) * 0 + (s[1] = 3)
                                            : (d[s[0]] = c[0] > d[s[0] - 1] || (c[0] == d[s[0] - 1] && c[1] > k[s[0] - 1]) ? c[0] : d[s[0] - 1]) * 0
                                                + (k[s[0]] = c[0] > d[s[0] - 1] || (c[0] == d[s[0] - 1] && c[1] > k[s[0] - 1]) ? (int) c[1] : k[s[0] - 1]) * 0
                                                + (s[1] = 0) + (s[0]++) * 0
                                        ).sum()).map(done -> new long[]{d[n], k[n]}).get()
                                    ).get()
                                ).get()
                            ).get()
                        ).get()
                    ).get())
                .map(f -> Optional.of(f.apply(0L)).map(t ->
                    t[1] == 0
                        ? Optional.of(new long[32 - Integer.numberOfLeadingZeros(n + 1)][]).map(sp ->
                            Optional.of(IntStream.range(0, sp.length)
                                    .peek(lv -> sp[lv] = lv == 0 ? p
                                        : IntStream.range(0, n + 2 - (1 << lv))
                                            .mapToLong(u -> Math.min(sp[lv - 1][u], sp[lv - 1][u + (1 << (lv - 1))])).toArray())
                                    .sum())
                                .map(ign -> IntStream.rangeClosed(l, n)
                                    .mapToLong(i -> Optional.of(Math.max(0, i - r)).map(lo ->
                                        Optional.of(31 - Integer.numberOfLeadingZeros(i - l - lo + 1)).map(lg ->
                                            p[i] - Math.min(sp[lg][lo], sp[lg][i - l - (1 << lg) + 1])).get()).get())
                                    .max().orElse(Long.MIN_VALUE))
                                .get()).get()
                    : t[1] <= m ? t[0]
                    : Stream.iterate(new long[]{0L, Arrays.stream(a).asLongStream().map(Math::abs).sum() + 1},
                            st -> f.apply((st[0] + st[1] + 1) >>> 1)[1] >= m
                                ? new long[]{(st[0] + st[1] + 1) >>> 1, st[1]}
                                : new long[]{st[0], ((st[0] + st[1] + 1) >>> 1) - 1})
                        .dropWhile(st -> st[0] < st[1])
                        .findFirst().map(st -> f.apply(st[0])[0] + st[0] * m).get()
                ).get()).get()).get()).get();
    }
}
