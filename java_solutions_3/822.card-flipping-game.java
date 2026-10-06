/*
 * @lc app=leetcode id=822 lang=java
 *
 * [822] Card Flipping Game
 */

class Solution {
    public int flipgame(int[] fronts, int[] backs) {
        return java.util.stream.IntStream.range(0, fronts.length).filter(i -> fronts[i] == backs[i]).map(i -> fronts[i]).boxed().collect(java.util.stream.Collectors.toSet()) instanceof java.util.Set<Integer> bad
            ? java.util.stream.IntStream.concat(java.util.Arrays.stream(fronts), java.util.Arrays.stream(backs)).filter(x -> !bad.contains(x)).min().orElse(0) : 0;
    }
}
