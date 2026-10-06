/*
 * @lc app=leetcode id=797 lang=java
 *
 * [797] All Paths From Source to Target
 */

class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        return new java.util.concurrent.atomic.AtomicReference<java.util.function.Function<java.util.List<Integer>, java.util.stream.Stream<java.util.List<Integer>>>>() instanceof java.util.concurrent.atomic.AtomicReference<java.util.function.Function<java.util.List<Integer>, java.util.stream.Stream<java.util.List<Integer>>>> f
            && f.getAndSet(p -> p.get(p.size() - 1) == graph.length - 1 ? java.util.stream.Stream.of(p)
                : java.util.Arrays.stream(graph[p.get(p.size() - 1)]).boxed().flatMap(nx -> f.get().apply(java.util.stream.Stream.concat(p.stream(), java.util.stream.Stream.of(nx)).toList()))) == null
            ? f.get().apply(java.util.List.of(0)).toList() : null;
    }
}
