/*
 * @lc app=leetcode id=2117 lang=java
 *
 * [2117] Abbreviating the Product of a Range
 */

class Solution {
    public String abbreviateProduct(int left, int right) {
        return ((Function<long[], Function<double[], String>>) L -> D -> IntStream.rangeClosed(left, right).reduce(0, (acc, n) -> (int)((L[0] *= n) * 0L + IntStream.iterate(0, d -> L[0] % 10 == 0, d -> d + 1).reduce(0, (a, d) -> (int)((L[0] /= 10) * 0L + (L[1]++) * 0L)) * 0L + (L[0] >= 1000000000000L ? (L[0] %= 1000000000000L) * 0L + (L[2] = 1) * 0L : 0L) + ((D[0] *= n) * 0.0) + IntStream.iterate(0, d -> D[0] >= 100000, d -> d + 1).reduce(0, (a, d) -> (int)((D[0] /= 10) * 0.0)) * 0L)) * 0 == 0 ? (L[2] == 0 && L[0] < 10000000000L ? L[0] + "e" + L[1] : (int)D[0] + "..." + "00000".substring(String.valueOf(L[0] % 100000).length()) + (L[0] % 100000) + "e" + L[1]) : "").apply(new long[]{1L, 0L, 0L}).apply(new double[]{1.0});
    }
}
