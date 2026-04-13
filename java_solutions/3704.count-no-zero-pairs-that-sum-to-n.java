/*
 * @lc app=leetcode id=3704 lang=java
 *
 * [3704] Count No-Zero Pairs That Sum to N
 */

class Solution {
    public long countNoZeroPairs(long n) {
        return n <= 1 ? 0 : Stream.<long[][]>of(new long[][]{
            LongStream.iterate(n, t -> t > 0, t -> t / 10).map(t -> t % 10).toArray(), 
            {1, 0, 0, 0, 0, 0, 0, 0}
        }).peek(s -> IntStream.range(0, s[0].length).forEach(pos -> 
            Stream.of(new long[8]).peek(nxt -> 
                IntStream.range(0, 800).filter(v -> s[1][v / 100] > 0).forEach(v -> 
                    Stream.of(v / 100).map(st -> new int[]{st >> 2, (st >> 1) & 1, st & 1, (v / 10) % 10, v % 10})
                        .filter(p -> !(pos == 0 && (p[3] == 0 || p[4] == 0)))
                        .filter(p -> !(p[1] == 1 && p[3] > 0))
                        .filter(p -> !(p[2] == 1 && p[4] > 0))
                        .filter(p -> (p[3] + p[4] + p[0]) % 10 == s[0][pos])
                        .forEach(p -> nxt[((p[3] + p[4] + p[0]) / 10 << 2) | (p[1] | (pos > 0 && p[3] == 0 ? 1 : 0)) << 1 | (p[2] | (pos > 0 && p[4] == 0 ? 1 : 0))] += s[1][(p[0] << 2) | (p[1] << 1) | p[2]])
                )
            ).forEach(nxt -> IntStream.range(0, 8).forEach(i -> s[1][i] = nxt[i]))
        )).mapToLong(s -> IntStream.range(0, 4).mapToLong(i -> s[1][i]).sum()).findFirst().getAsLong();
    }
}
