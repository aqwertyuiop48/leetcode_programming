/*
 * @lc app=leetcode id=849 lang=java
 *
 * [849] Maximize Distance to Closest Person
 */

class Solution {
    public int maxDistToClosest(int[] seats) {
        return java.util.stream.IntStream.range(0, seats.length).filter(i -> seats[i] == 1).boxed().toList() instanceof java.util.List<Integer> p
            ? Math.max(Math.max(p.get(0), seats.length - 1 - p.get(p.size() - 1)), java.util.stream.IntStream.range(1, p.size()).map(i -> (p.get(i) - p.get(i - 1)) / 2).max().orElse(0)) : 0;
    }
}
