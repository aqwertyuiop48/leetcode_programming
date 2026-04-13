/*
 * @lc app=leetcode id=2246 lang=java
 *
 * [2246] Longest Path With Different Adjacent Characters
 */

class Solution { public int longestPath(int[] parent, String s) { return ((Function<int[], Function<int[], Function<int[], Integer>>>) deg -> dp -> q -> ((ToIntFunction<int[]>) state -> IntStream.range(1, parent.length).reduce(0, (acc, i) -> (deg[parent[i]]++) * 0) * 0 == 0 && IntStream.range(0, parent.length).reduce(0, (acc, i) -> (dp[i] = 1) * 0 + (deg[i] == 0 ? (q[state[1]++] = i) * 0 : 0)) * 0 == 0 && IntStream.iterate(0, h -> h < parent.length, h -> h + 1).reduce(0, (acc, h) -> ((IntUnaryOperator) u -> (parent[u] != -1 ? (s.charAt(u) != s.charAt(parent[u]) ? (state[0] = Math.max(state[0], dp[parent[u]] + dp[u])) * 0 + (dp[parent[u]] = Math.max(dp[parent[u]], dp[u] + 1)) * 0 : 0) * 0 + (--deg[parent[u]] == 0 ? (q[state[1]++] = parent[u]) * 0 : 0) : 0)).applyAsInt(q[h]) * 0) * 0 == 0 ? Math.max(state[0], 1) : 0).applyAsInt(new int[]{1, 0})).apply(new int[parent.length]).apply(new int[parent.length]).apply(new int[parent.length]); } }
