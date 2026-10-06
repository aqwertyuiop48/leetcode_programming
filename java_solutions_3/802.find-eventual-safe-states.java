/*
 * @lc app=leetcode id=802 lang=java
 *
 * [802] Find Eventual Safe States
 */

class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        return new int[graph.length] instanceof int[] deg && java.util.stream.IntStream.range(0, graph.length).peek(i -> deg[i] = graph[i].length).allMatch(x -> true)
            && java.util.stream.IntStream.range(0, graph.length).boxed().flatMap(u -> java.util.Arrays.stream(graph[u]).mapToObj(v -> new int[]{v, u}))
                .collect(java.util.stream.Collectors.groupingBy(e -> e[0], java.util.stream.Collectors.mapping(e -> e[1], java.util.stream.Collectors.toList()))) instanceof java.util.Map<Integer, java.util.List<Integer>> rev
            && new java.util.ArrayDeque<Integer>(java.util.stream.IntStream.range(0, graph.length).filter(i -> graph[i].length == 0).boxed().toList()) instanceof java.util.ArrayDeque<Integer> q
            ? java.util.stream.Stream.generate(q::poll).takeWhile(java.util.Objects::nonNull)
                .peek(u -> rev.getOrDefault(u, java.util.List.of()).stream().filter(v -> --deg[v] == 0).forEach(q::add)).sorted().toList()
            : null;
    }
}
