/*
 * @lc app=leetcode id=2050 lang=java
 *
 * [2050] Parallel Courses III
 */

class Solution { public int minimumTime(int n, int[][] relations, int[] time) { return ((Function<int[], Function<int[], Function<int[], Function<int[], Integer>>>>) inDeg -> head -> to -> nxt -> IntStream.range(0, n).reduce(0, (acc, i) -> (head[i] = -1) * 0) * 0 == 0 && IntStream.range(0, relations.length).reduce(0, (acc, i) -> (to[i] = relations[i][1] - 1) * 0 + (nxt[i] = head[relations[i][0] - 1]) * 0 + (head[relations[i][0] - 1] = i) * 0 + (inDeg[relations[i][1] - 1]++) * 0) * 0 == 0 ? ((Function<int[], Function<int[], ToIntFunction<int[]>>>) dist -> q -> ptrs -> IntStream.range(0, n).reduce(0, (acc, i) -> inDeg[i] == 0 ? (q[ptrs[1]++] = i) * 0 + (dist[i] = time[i]) * 0 : 0) * 0 == 0 && IntStream.iterate(0, d -> ptrs[0] < ptrs[1], d -> d + 1).reduce(0, (acc, d) -> ((IntUnaryOperator) u -> IntStream.iterate(head[u], e -> e != -1, e -> nxt[e]).reduce(0, (a, e) -> (dist[to[e]] = Math.max(dist[to[e]], dist[u] + time[to[e]])) * 0 + (--inDeg[to[e]] == 0 ? (q[ptrs[1]++] = to[e]) * 0 : 0)) * 0).applyAsInt(q[ptrs[0]++]) * 0) * 0 == 0 ? IntStream.of(dist).max().orElse(0) : 0).apply(new int[n]).apply(new int[n]).applyAsInt(new int[2]) : 0).apply(new int[n]).apply(new int[n]).apply(new int[relations.length]).apply(new int[relations.length]); } }
