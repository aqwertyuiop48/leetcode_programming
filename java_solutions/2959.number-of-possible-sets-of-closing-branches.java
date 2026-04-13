/*
 * @lc app=leetcode id=2959 lang=java
 *
 * [2959] Number of Possible Sets of Closing Branches
 */

class Solution { public int numberOfSets(int n, int maxDistance, int[][] roads) { return ((Function<int[], Integer>) baseD -> IntStream.range(0, 1 << n).reduce(0, (acc, mask) -> acc + (((Function<int[], Integer>) d -> IntStream.range(0, n).reduce(0, (dummy, k) -> ((mask & (1 << k)) != 0) ? IntStream.range(0, n).reduce(0, (dummy2, i) -> ((mask & (1 << i)) != 0) ? IntStream.range(0, n).reduce(0, (dummy3, j) -> ((mask & (1 << j)) != 0) ? (d[i * n + j] = Math.min(d[i * n + j], d[i * n + k] + d[k * n + j])) * 0 : 0) * 0 : 0) * 0 : 0) * 0 == 0 && IntStream.range(0, n).reduce(0, (maxDist, i) -> ((mask & (1 << i)) != 0) ? Math.max(maxDist, IntStream.range(0, n).reduce(0, (m2, j) -> ((mask & (1 << j)) != 0) ? Math.max(m2, i == j ? 0 : d[i * n + j]) : m2)) : maxDist) <= maxDistance ? 1 : 0).apply(baseD.clone())))).apply(((Function<int[], int[]>) d -> IntStream.range(0, n * n).reduce(0, (dummy, i) -> (d[i] = (i / n == i % n ? 0 : 200000)) * 0) * 0 == 0 && IntStream.range(0, roads.length).reduce(0, (dummy, i) -> (d[roads[i][0] * n + roads[i][1]] = Math.min(d[roads[i][0] * n + roads[i][1]], roads[i][2])) * 0 + (d[roads[i][1] * n + roads[i][0]] = Math.min(d[roads[i][1] * n + roads[i][0]], roads[i][2])) * 0) * 0 == 0 ? d : d).apply(new int[n * n])); } }
