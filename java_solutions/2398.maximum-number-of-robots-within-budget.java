/*
 * @lc app=leetcode id=2398 lang=java
 *
 * [2398] Maximum Number of Robots Within Budget
 */

class Solution { public int maximumRobots(int[] times, int[] costs, long budget) { return ((Function<long[], Integer>) state -> ((Function<int[], Integer>) q -> IntStream.range(0, times.length).map(j -> (int)((state[0] += costs[j]) * 0L + IntStream.iterate(0, dummy -> state[3] > state[2] && times[q[(int)state[3] - 1]] <= times[j], dummy -> dummy + 1).mapToLong(dummy -> state[3]--).sum() * 0L + (q[(int)state[3]++] = j) * 0L + ((times[q[(int)state[2]]] + (j - state[1] + 1) * state[0] > budget) ? (q[(int)state[2]] == state[1] ? state[2]++ : 0) * 0L + (state[0] -= costs[(int)state[1]++]) * 0L : 0L))).sum() * 0 == 0 ? times.length - (int)state[1] : 0).apply(new int[times.length])).apply(new long[4]); } }
