/*
 * @lc app=leetcode id=2862 lang=java
 *
 * [2862] Maximum Element-Sum of a Complete Subset of Indices
 */

class Solution { public long maximumSum(List<Integer> A) { return ((Function<Map<Integer, Long>, Long>) count -> IntStream.range(0, A.size()).mapToLong(i -> count.merge(IntStream.rangeClosed(2, (int)Math.sqrt(i + 1)).reduce(i + 1, (curr, v) -> IntStream.iterate(curr, c -> c / (v * v)).filter(c -> c % (v * v) != 0).findFirst().orElse(curr)), (long)A.get(i), Long::sum)).max().orElse(0)).apply(new HashMap<>()); } }
