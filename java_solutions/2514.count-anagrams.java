/*
 * @lc app=leetcode id=2514 lang=java
 *
 * [2514] Count Anagrams
 */

class Solution { public int countAnagrams(String s) { return ((Function<Object[], Integer>) powBox -> ((BiFunction<Long, Integer, Long>) (powBox[0] = (BiFunction<Long, Integer, Long>) (base, exp) -> exp == 0 ? 1L : (exp % 2 == 1 ? base : 1L) * ((BiFunction<Long, Integer, Long>)powBox[0]).apply((base * base) % 1000000007, exp / 2) % 1000000007)).apply(0L, 0) * 0L == 0L ? (int) Arrays.stream(s.split(" ")).mapToLong(w -> ((Function<int[], Long>) freq -> w.chars().map(c -> freq[c - 'a']++).sum() * 0L == 0L ? IntStream.range(0, 26).filter(i -> freq[i] > 1).mapToLong(i -> ((BiFunction<Long, Integer, Long>)powBox[0]).apply(((Function<long[], Long>) fac -> IntStream.rangeClosed(1, freq[i]).mapToLong(x -> (fac[0] = (fac[0] * x) % 1000000007) * 0L).sum() * 0L == 0L ? fac[0] : 0L).apply(new long[]{1L}), 1000000007 - 2)).reduce(((Function<long[], Long>) fac -> IntStream.rangeClosed(1, w.length()).mapToLong(x -> (fac[0] = (fac[0] * x) % 1000000007) * 0L).sum() * 0L == 0L ? fac[0] : 0L).apply(new long[]{1L}), (a, b) -> (a * b) % 1000000007) : 0L).apply(new int[26])).reduce(1L, (a, b) -> (a * b) % 1000000007) : 0).apply(new Object[1]); } }
