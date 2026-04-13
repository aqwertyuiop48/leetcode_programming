/*
 * @lc app=leetcode id=3519 lang=java
 *
 * [3519] Count Numbers with Non-Decreasing Digits 
 */

import java.math.BigInteger;

class Solution {
    public int countNumbers(String l, String r, int b) {
        return Optional.of(new Object[]{new BigInteger(r).toString(b).chars().map(c -> c <= '9' ? c - '0' : c - 'a' + 10).toArray(), new BigInteger(l).equals(BigInteger.ZERO) ? new int[0] : new BigInteger(l).subtract(BigInteger.ONE).toString(b).chars().map(c -> c <= '9' ? c - '0' : c - 'a' + 10).toArray(), null, new LongUnaryOperator[1]}).map((Object[] st) -> (((st[2] = new long[2][Math.max(((int[])st[0]).length, ((int[])st[1]).length) + 1][2][b + 1]) != null) ? st : st)).map((Object[] st) -> IntStream.range(0, 2).map(isR -> IntStream.range(0, ((long[][][][])st[2])[isR].length).map(pos -> IntStream.range(0, 2).map(tight -> IntStream.range(0, b + 1).map(last -> (int)(((long[][][][])st[2])[isR][pos][tight][last] = -1L) * 0).sum() * 0).sum() * 0).sum() * 0).sum() == 0 ? st : st).map((Object[] st) -> (((LongUnaryOperator[])st[3])[0] = (LongUnaryOperator) (state -> Optional.of(new int[]{ (int)(state >> 24) & 1, (int)(state >> 8) & 0xFFFF, (int)(state >> 6) & 1, (int)state & 0x3F }).map((int[] p) -> p[1] == ((int[])st[p[0]]).length ? 1L : (((long[][][][])st[2])[p[0]][p[1]][p[2]][p[3]] != -1L ? ((long[][][][])st[2])[p[0]][p[1]][p[2]][p[3]] : (((long[][][][])st[2])[p[0]][p[1]][p[2]][p[3]] = LongStream.rangeClosed(0, p[2] == 1 ? ((int[])st[p[0]])[p[1]] : b - 1).filter(j -> j >= p[3]).map(j -> ((LongUnaryOperator[])st[3])[0].applyAsLong(((long)p[0] << 24) | ((long)(p[1] + 1) << 8) | ((long)(p[2] & (j == ((int[])st[p[0]])[p[1]] ? 1 : 0)) << 6) | j)).reduce(0L, (acc, val) -> (acc + val) % 1_000_000_007L)))).get())) != null ? st : st).map((Object[] st) -> (int) (((((LongUnaryOperator[])st[3])[0].applyAsLong((0L << 24) | (0L << 8) | (1L << 6) | 0L) - 1L) - (((int[])st[1]).length == 0 ? 0L : (((LongUnaryOperator[])st[3])[0].applyAsLong((1L << 24) | (0L << 8) | (1L << 6) | 0L) - 1L)) + 1_000_000_007L) % 1_000_000_007L)).get();
    }
}
