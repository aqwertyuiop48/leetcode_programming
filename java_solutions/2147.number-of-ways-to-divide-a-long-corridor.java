/*
 * @lc app=leetcode id=2147 lang=java
 *
 * [2147] Number of Ways to Divide a Long Corridor
 */

class Solution { public int numberOfWays(String corridor) { return ((Function<int[], Integer>) pos -> pos.length == 0 || pos.length % 2 != 0 ? 0 : (int) IntStream.iterate(2, i -> i < pos.length, i -> i + 2).mapToLong(i -> pos[i] - pos[i - 1]).reduce(1L, (acc, gap) -> (acc * gap) % 1000000007L)).apply(IntStream.range(0, corridor.length()).filter(i -> corridor.charAt(i) == 'S').toArray()); } }
