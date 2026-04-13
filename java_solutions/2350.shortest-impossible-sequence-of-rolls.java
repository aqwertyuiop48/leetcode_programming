/*
 * @lc app=leetcode id=2350 lang=java
 *
 * [2350] Shortest Impossible Sequence of Rolls
 */

class Solution { public int shortestSequence(int[] rolls, int k) { return ((Function<int[], Function<int[], Integer>>) seen -> state -> IntStream.of(rolls).map(a -> seen[a] < state[0] ? (seen[a] = state[0]) * 0 + (++state[1] == k ? (state[0]++) * 0 + (state[1] = 0) * 0 : 0) : 0).sum() * 0 == 0 ? state[0] : 0).apply(new int[k + 1]).apply(new int[]{1, 0}); } }
