/*
 * @lc app=leetcode id=3219 lang=java
 *
 * [3219] Minimum Cost for Cutting Cake II
 */

class Solution { public long minimumCost(int m, int n, int[] h, int[] v) { return ((Function<int[], Function<int[], Long>>) H -> V -> ((Function<long[], Long>) state -> IntStream.range(0, h.length + v.length).reduce(0, (acc, step) -> (int)( (state[0] >= 0 && (state[1] < 0 || H[(int)state[0]] > V[(int)state[1]]) ? (state[2] += (long)H[(int)state[0]] * (v.length - state[1])) * 0L + (state[0]--) * 0L : (state[2] += (long)V[(int)state[1]] * (h.length - state[0])) * 0L + (state[1]--) * 0L) )) * 0 == 0 ? state[2] : 0L).apply(new long[]{ h.length - 1, v.length - 1, 0 })).apply(IntStream.of(h).sorted().toArray()).apply(IntStream.of(v).sorted().toArray()); } }
