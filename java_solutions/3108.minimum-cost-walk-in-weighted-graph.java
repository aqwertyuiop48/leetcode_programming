/*
 * @lc app=leetcode id=3108 lang=java
 *
 * [3108] Minimum Cost Walk in Weighted Graph
 */

class Solution { public int[] minimumCost(int n, int[][] edges, int[][] query) { return ((Function<int[], Function<int[], int[]>>) parent -> minPathCost -> ((Function<Object[], int[]>) box -> ((Function<Function<Integer, Integer>, int[]>) findRoot -> IntStream.range(0, edges.length).reduce(0, (acc, i) -> acc + ((BiFunction<Integer, Integer, Integer>) (sr, tr) -> (minPathCost[tr] &= edges[i][2]) * 0 + (sr.intValue() != tr.intValue() ? (minPathCost[tr] &= minPathCost[sr]) * 0 + (parent[sr] = tr) * 0 : 0)).apply(findRoot.apply(edges[i][0]), findRoot.apply(edges[i][1]))) * 0 == 0 ? Arrays.stream(query).mapToInt(q -> q[0] == q[1] ? 0 : findRoot.apply(q[0]).intValue() != findRoot.apply(q[1]).intValue() ? -1 : minPathCost[findRoot.apply(q[0])]).toArray() : null).apply((Function<Integer, Integer>) (box[0] = (Function<Integer, Integer>) i -> parent[i] == i ? i : (parent[i] = ((Function<Integer, Integer>)box[0]).apply(parent[i]))))).apply(new Object[1])).apply(IntStream.range(0, n).toArray()).apply(IntStream.range(0, n).map(x -> -1).toArray()); } }
