/*
 * @lc app=leetcode id=2876 lang=java
 *
 * [2876] Count Visited Nodes in a Directed Graph
 */

class Solution { public int[] countVisitedNodes(List<Integer> edges) { return ((Function<int[], Function<int[], Function<Object[], int[]>>>) res -> step -> box -> IntStream.range(0, edges.size()).map(i -> ((BiFunction<Integer, Integer, Integer>) (box[0] = (BiFunction<Integer, Integer, Integer>) (u, d) -> res[u] > 0 ? res[u] : step[u] > 0 ? (int)IntStream.iterate(u, x -> edges.get(x)).limit(d - step[u]).map(x -> res[x] = d - step[u]).sum() * 0 + d - step[u] : ((Function<Integer, Integer>) nextD -> ((Function<Integer, Integer>) r -> res[u] == 0 ? (res[u] = r + 1) : res[u]).apply(((BiFunction<Integer, Integer, Integer>)box[0]).apply(edges.get(u), nextD))).apply((step[u] = d) + 1))).apply(i, 1)).sum() * 0 == 0 ? res : res).apply(new int[edges.size()]).apply(new int[edges.size()]).apply(new Object[1]); } }
