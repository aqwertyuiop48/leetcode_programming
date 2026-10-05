/*
 * @lc app=leetcode id=3966 lang=java
 *
 * [3966] Count Good Integers in a Range
 */

class Solution {
public long goodIntegers(long l, long r, int k) {
    return LongStream.of(r, l - 1).map(n -> n <= 0 ? 0 : Arrays.stream(Long.toString(n).chars().boxed().map(c -> c - '0').reduce(IntStream.range(0, 2).mapToObj(t -> LongStream.range(0, 11).map(p -> t == 1 && p == 10 ? 1 : 0).toArray()).toArray(long[][]::new), (S, lim) -> Stream.<long[][]>of(new long[2][11]).peek(N -> IntStream.range(0, 22).forEach(idx -> IntStream.rangeClosed(0, idx / 11 == 1 ? lim : 9).filter(d -> idx % 11 == 10 || Math.abs(d - idx % 11) <= k).forEach(d -> N[idx / 11 == 1 && d == lim ? 1 : 0][idx % 11 == 10 && d == 0 ? 10 : d] += S[idx / 11][idx % 11]))).findFirst().get(), (u, v) -> u)).mapToLong(row -> Arrays.stream(row, 0, 10).sum()).sum()).reduce((u, v) -> u - v).getAsLong();
}
}
