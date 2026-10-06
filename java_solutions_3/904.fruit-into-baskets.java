/*
 * @lc app=leetcode id=904 lang=java
 *
 * [904] Fruit Into Baskets
 */

class Solution {
    public int totalFruit(int[] fruits) {
        return new java.util.HashMap<Integer, Integer>() instanceof java.util.HashMap<Integer, Integer> m && new int[]{0} instanceof int[] l
            ? java.util.stream.IntStream.range(0, fruits.length).map(r -> m.merge(fruits[r], 1, Integer::sum) > 0
                && java.util.stream.Stream.of(0).peek(z -> {
                    while (m.size() > 2 && (m.compute(fruits[l[0]], (k, v) -> v == 1 ? null : v - 1) == null || true) && l[0]++ >= 0) {}
                }).anyMatch(z -> true) ? r - l[0] + 1 : 0).max().orElse(0)
            : 0;
    }
}
