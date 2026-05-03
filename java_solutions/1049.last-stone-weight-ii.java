/*
 * @lc app=leetcode id=1049 lang=java
 *
 * [1049] Last Stone Weight II
 */

class Solution {
    public int lastStoneWeightII(int[] stones) {
        return java.util.stream.IntStream.of(stones).sum() - 2 * java.util.stream.IntStream.of(stones).boxed().reduce(new java.util.HashSet<Integer>(java.util.Arrays.asList(0)), (set, s) -> java.util.stream.Stream.concat(set.stream(), set.stream().map(x -> x + s).filter(x -> x <= java.util.stream.IntStream.of(stones).sum() / 2)).collect(java.util.stream.Collectors.toCollection(java.util.HashSet::new)), (a, b) -> a).stream().mapToInt(Integer::intValue).max().orElse(0);
    }
}
