/*
 * @lc app=leetcode id=967 lang=java
 *
 * [967] Numbers With Same Consecutive Differences
 */

class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        return java.util.stream.Stream.iterate(java.util.stream.IntStream.rangeClosed(1, 9).boxed().toList(),
                l -> l.stream().flatMap(x -> java.util.stream.IntStream.of(x % 10 + k, x % 10 - k).distinct().filter(d -> d >= 0 && d <= 9).mapToObj(d -> x * 10 + d)).toList())
            .skip(n - 1).findFirst().get().stream().mapToInt(Integer::intValue).toArray();
    }
}
