/*
 * @lc app=leetcode id=2790 lang=java
 *
 * [2790] Maximum Number of Groups With Increasing Length
 */

class Solution { public int maxIncreasingGroups(List<Integer> usageLimits) { return ((Function<int[], Integer>) sorted -> ((ToIntFunction<long[]>) state -> IntStream.of(sorted).reduce(0, (acc, val) -> (int)((state[0] += val) * 0L + (state[0] >= (state[1] + 1) * (state[1] + 2) / 2 ? state[1]++ : 0) * 0L)) * 0 == 0 ? (int)state[1] : 0).applyAsInt(new long[2])).apply(IntStream.range(0, usageLimits.size()).map(usageLimits::get).sorted().toArray()); } }
