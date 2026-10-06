/*
 * @lc app=leetcode id=785 lang=java
 *
 * [785] Is Graph Bipartite?
 */

class Solution {
    public boolean isBipartite(int[][] graph) {
        return new int[graph.length] instanceof int[] color && java.util.stream.IntStream.range(0, graph.length).allMatch(i -> color[i] != 0
            || (color[i] = 1) == 1 && new java.util.ArrayDeque<Integer>(java.util.List.of(i)) instanceof java.util.ArrayDeque<Integer> q
                && java.util.stream.Stream.generate(q::poll).takeWhile(java.util.Objects::nonNull)
                    .allMatch(u -> java.util.Arrays.stream(graph[u]).allMatch(v -> color[v] == 0 ? (color[v] = -color[u]) != 0 && q.add(v) : color[v] != color[u])));
    }
}
