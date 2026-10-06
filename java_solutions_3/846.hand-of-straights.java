/*
 * @lc app=leetcode id=846 lang=java
 *
 * [846] Hand of Straights
 */

class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        return hand.length % groupSize == 0 && new java.util.TreeMap<Integer, Integer>() instanceof java.util.TreeMap<Integer, Integer> m
            && java.util.Arrays.stream(hand).peek(x -> m.merge(x, 1, Integer::sum)).allMatch(x -> true)
            && java.util.stream.Stream.generate(() -> m.isEmpty() ? null : m.firstKey()).takeWhile(java.util.Objects::nonNull)
                .allMatch(k -> java.util.stream.IntStream.range(k, k + groupSize).allMatch(x -> m.containsKey(x) && (m.computeIfPresent(x, (q, v) -> v == 1 ? null : v - 1) == null || true)));
    }
}
