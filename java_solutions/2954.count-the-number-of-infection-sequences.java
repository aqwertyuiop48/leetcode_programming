/*
 * @lc app=leetcode id=2954 lang=java
 *
 * [2954] Count the Number of Infection Sequences
 */

class Solution { public int numberOfSequence(int n, int[] sick) { return ((Function<Object[], Integer>) mpBox -> ((Function<BiFunction<Long, Integer, Long>, Integer>) modPow -> ((Function<long[], Integer>) fac -> (int)((((fac[n - sick.length] * modPow.apply(fac[sick[0]], 1000000007 - 2)) % 1000000007) * modPow.apply(fac[n - sick[sick.length - 1] - 1], 1000000007 - 2)) % 1000000007 * IntStream.range(1, sick.length).map(i -> sick[i] - sick[i-1] - 1).filter(g -> g > 0).mapToLong(g -> (modPow.apply(2L, g - 1) * modPow.apply(fac[g], 1000000007 - 2)) % 1000000007).reduce(1L, (a, b) -> (a * b) % 1000000007) % 1000000007)).apply(((Function<long[], long[]>) f -> ((f[0] = 1L) == 1L ? IntStream.rangeClosed(1, n).mapToLong(i -> (f[i] = (f[i-1] * i) % 1000000007) * 0L).sum() == 0 ? f : f : f)).apply(new long[n + 1]))).apply((BiFunction<Long, Integer, Long>) (mpBox[0] = (BiFunction<Long, Integer, Long>) (base, exp) -> exp == 0 ? 1L : (exp % 2 == 1 ? base : 1L) * ((BiFunction<Long, Integer, Long>)mpBox[0]).apply((base * base) % 1000000007, exp / 2) % 1000000007))).apply(new Object[1]); } }
