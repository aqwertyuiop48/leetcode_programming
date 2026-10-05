/*
 * @lc app=leetcode id=4053 lang=java
 *
 * [4053] Minimum Operations to Make Every Element Palindromic
 */

class Solution {
public long minOperations(int[] A) { return Arrays.stream(A).mapToLong(a -> Stream.of(((long[][]) System.getProperties().computeIfAbsent("pal.cache", k -> Stream.of(0, 1).map(par -> IntStream.range(1, 100000).mapToObj(String::valueOf).flatMapToLong(s -> LongStream.of(Long.parseLong(s.substring(0, s.length() - 1) + new StringBuilder(s).reverse()), Long.parseLong(s + new StringBuilder(s).reverse()))).filter(x -> x < 1_000_000_000L && (x & 1) == par).sorted().toArray()).toArray(long[][]::new)))[a & 1]).mapToLong(p -> IntStream.of(Arrays.binarySearch(p, (long) a)).map(b -> Math.min(p.length - 1, b ^ (b >> 31))).mapToLong(i -> Math.min(Math.abs(a - p[i]), Math.abs(a - p[Math.max(i - 1, 0)])) / 2).sum()).sum()).sum(); }
}
