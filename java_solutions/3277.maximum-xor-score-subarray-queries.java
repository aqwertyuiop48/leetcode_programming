/*
 * @lc app=leetcode id=3277 lang=java
 *
 * [3277] Maximum XOR Score Subarray Queries
 */

class Solution { public int[] maximumSubarrayXor(int[] A, int[][] queries) { return ((IntFunction<int[]>) n -> ((IntFunction<int[]>) m -> ((Function<int[], int[]>) head -> ((Function<int[], int[]>) nxt -> ((Function<int[], int[]>) res -> ((Function<int[], int[]>) cur -> IntStream.range(0, n).reduce(0, (acc, i) -> (head[i] = -1) * 0) * 0 == 0 && IntStream.range(0, m).reduce(0, (acc, i) -> (nxt[i] = head[queries[i][1] - queries[i][0]]) * 0 + (head[queries[i][1] - queries[i][0]] = i) * 0) * 0 == 0 && IntStream.range(0, n).reduce(0, (acc, v) -> IntStream.iterate(head[v], qi -> qi != -1, qi -> nxt[qi]).reduce(0, (acc2, qi) -> (res[qi] = cur[queries[qi][0]]) * 0) * 0 + IntStream.range(0, n - v - 1).reduce(0, (acc2, i) -> (A[i] ^= A[i + 1]) * 0 + (cur[i] = Math.max(cur[i], Math.max(cur[i + 1], A[i]))) * 0) * 0) * 0 == 0 ? res : res).apply(A.clone())).apply(new int[m])).apply(new int[m])).apply(new int[n])).apply(queries.length)).apply(A.length); } }
