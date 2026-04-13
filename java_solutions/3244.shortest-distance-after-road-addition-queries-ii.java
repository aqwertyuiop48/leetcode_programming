/*
 * @lc app=leetcode id=3244 lang=java
 *
 * [3244] Shortest Distance After Road Addition Queries II
 */

class Solution { public int[] shortestDistanceAfterQueries(int n, int[][] queries) { return ((Function<int[], int[]>) next -> ((Function<int[], int[]>) size -> ((Function<Object[], int[]>) box -> ((Function<BiFunction<Integer, Integer, Integer>, int[]>) removeNodes -> Arrays.stream(queries).mapToInt(q -> (next[q[0]] != 0 && next[q[0]] < q[1]) ? ((removeNodes.apply(next[q[0]], q[1]) * 0) + (next[q[0]] = q[1]) * 0 + size[0]) : size[0]).toArray()).apply((BiFunction<Integer, Integer, Integer>) (box[0] = (BiFunction<Integer, Integer, Integer>) (j, v) -> (j != 0 && j < v) ? ((BiFunction<Integer, Integer, Integer>) box[0]).apply((size[0]--) * 0 + next[j] + (next[j] = 0) * 0, v) : j))).apply(new Object[1])).apply(new int[]{n - 1})).apply(IntStream.range(0, n).map(i -> i + 1).toArray()); } }
