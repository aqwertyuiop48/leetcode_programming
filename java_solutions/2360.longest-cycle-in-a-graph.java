/*
 * @lc app=leetcode id=2360 lang=java
 *
 * [2360] Longest Cycle in a Graph
 */

class Solution { public int longestCycle(int[] edges) { return ((Function<int[], Function<int[], Integer>>) time -> state -> IntStream.range(0, edges.length).map(i -> time[i] == 0 ? (state[3] = state[0]) * 0 + (state[2] = i) * 0 + (int)IntStream.iterate(0, d -> state[2] != -1 && time[state[2]] == 0, d -> d).map(d -> (time[state[2]] = state[0]++) * 0 + (state[2] = edges[state[2]]) * 0).sum() * 0 + (state[2] != -1 && time[state[2]] >= state[3] ? (state[1] = Math.max(state[1], state[0] - time[state[2]])) * 0 : 0) : 0).sum() * 0 == 0 ? state[1] : -1).apply(new int[edges.length]).apply(new int[]{1, -1, 0, 0}); } }
