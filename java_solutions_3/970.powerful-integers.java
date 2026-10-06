/*
 * @lc app=leetcode id=970 lang=java
 *
 * [970] Powerful Integers
 */

class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        return ((java.util.function.Function<Integer, java.util.List<Long>>) b -> b == 1 ? java.util.List.of(1L) : java.util.stream.Stream.iterate(1L, v -> v <= bound, v -> v * b).toList()) instanceof java.util.function.Function<Integer, java.util.List<Long>> pw
            ? pw.apply(x).stream().flatMap(a -> pw.apply(y).stream().map(b -> a + b)).filter(v -> v <= bound).distinct().map(Long::intValue).toList() : null;
    }
}
