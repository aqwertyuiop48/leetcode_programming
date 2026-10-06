/*
 * @lc app=leetcode id=3901 lang=java
 *
 * [3901] Good Subsequence Queries
 */

class Solution {
    public int countGoodSubseq(int[] nums, int p, int[][] queries) {
        return new int[50001] instanceof int[] spf
            && java.util.stream.IntStream.rangeClosed(2, 50000).filter(i -> spf[i] == 0).peek(i -> java.util.stream.IntStream.iterate(i, j -> j <= 50000, j -> j + i).filter(j -> spf[j] == 0).forEach(j -> spf[j] = i)).allMatch(x -> true)
            && nums.clone() instanceof int[] a && new int[50001] instanceof int[] cnt && new int[nums.length + 2] instanceof int[] fc && new int[1] instanceof int[] cp
            && ((java.util.function.IntBinaryOperator) (v, s) -> v % p != 0 ? 0 : java.util.stream.IntStream.iterate(v / p, x -> x > 1, x -> x / spf[x]).map(x -> spf[x]).distinct()
                .map(q -> 0 * fc[cnt[q]]-- + 0 * (cnt[q] += s) + 0 * fc[cnt[q]]++).sum() + (cp[0] += s) * 0) instanceof java.util.function.IntBinaryOperator upd
            && java.util.stream.IntStream.range(0, a.length).peek(i -> upd.applyAsInt(a[i], 1)).allMatch(x -> true)
            ? (int) java.util.Arrays.stream(queries).filter(q -> upd.applyAsInt(a[q[0]], -1) + (a[q[0]] = q[1]) * 0 + upd.applyAsInt(q[1], 1) * 0 >= 0 && cp[0] > 0
                && (cp[0] < a.length ? fc[cp[0]] == 0 : fc[a.length] == 0 && (fc[a.length - 1] < a.length
                    || java.util.stream.IntStream.range(0, a.length).anyMatch(x -> java.util.stream.IntStream.range(0, a.length).filter(y -> y != x).map(y -> a[y])
                        .reduce(0, (u, w) -> java.math.BigInteger.valueOf(u).gcd(java.math.BigInteger.valueOf(w)).intValue()) == p)))).count()
            : 0;
    }
}
