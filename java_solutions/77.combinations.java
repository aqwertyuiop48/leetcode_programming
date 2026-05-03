/*
 * @lc app=leetcode id=77 lang=java
 *
 * [77] Combinations
 */

class Solution {
    public java.util.List<java.util.List<Integer>> combine(int n, int k) {
        return java.util.stream.IntStream.range(0, k).boxed().reduce(java.util.Collections.singletonList(java.util.Collections.<Integer>emptyList()), (res, i) -> res.stream().flatMap(l -> java.util.stream.IntStream.rangeClosed(l.isEmpty() ? 1 : l.get(l.size() - 1) + 1, n).mapToObj(x -> java.util.stream.Stream.concat(l.stream(), java.util.stream.Stream.of(x)).collect(java.util.stream.Collectors.toList()))).collect(java.util.stream.Collectors.toList()), (a, b) -> a);
    }
}
