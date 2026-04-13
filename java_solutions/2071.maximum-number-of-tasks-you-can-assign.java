/*
 * @lc app=leetcode id=2071 lang=java
 *
 * [2071] Maximum Number of Tasks You Can Assign
 */

class Solution { public int maxTaskAssign(int[] tasks, int[] workers, int pills, int strength) { return ((Function<int[], Function<int[], Function<int[], Integer>>>) t -> w -> dq -> ((ToIntFunction<int[]>) bounds -> IntStream.iterate(0, d -> bounds[0] <= bounds[1], d -> d + 1).reduce(0, (a, d) -> ((IntUnaryOperator) mid -> ((Function<int[], Boolean>) state -> IntStream.iterate(mid - 1, i -> i >= 0 && state[0] != -1, i -> i - 1).reduce(0, (acc, i) -> IntStream.iterate(0, x -> state[2] >= w.length - mid && w[state[2]] + strength >= t[i], x -> x + 1).reduce(0, (a2, x) -> (dq[state[1]++] = w[state[2]--]) * 0) * 0 + (state[0] == state[1] ? (state[0] = -1) * 0 : (dq[state[0]] >= t[i] ? (state[0]++) * 0 : (state[3] > 0 ? (state[3]--) * 0 + (state[1]--) * 0 : (state[0] = -1) * 0)))) * 0 == 0 ? state[0] != -1 : false).apply(new int[]{0, 0, w.length - 1, pills}) ? (bounds[2] = mid) * 0 + (bounds[0] = mid + 1) * 0 : (bounds[1] = mid - 1) * 0).applyAsInt((bounds[0] + bounds[1]) >>> 1) * 0) * 0 == 0 ? bounds[2] : 0).applyAsInt(new int[]{0, Math.min(tasks.length, workers.length), 0})).apply(IntStream.of(tasks).sorted().toArray()).apply(IntStream.of(workers).sorted().toArray()).apply(new int[workers.length]); } }
