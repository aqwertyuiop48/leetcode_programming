/*
 * @lc app=leetcode id=886 lang=java
 *
 * [886] Possible Bipartition
 */

class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        return java.util.Arrays.stream(dislikes).flatMap(e -> java.util.stream.Stream.of(new int[]{e[0], e[1]}, new int[]{e[1], e[0]}))
                .collect(java.util.stream.Collectors.groupingBy(e -> e[0], java.util.stream.Collectors.mapping(e -> e[1], java.util.stream.Collectors.toList()))) instanceof java.util.Map<Integer, java.util.List<Integer>> g
            && new int[n + 1] instanceof int[] color
            && java.util.stream.IntStream.rangeClosed(1, n).allMatch(i -> color[i] != 0
                || (color[i] = 1) == 1 && new java.util.ArrayDeque<Integer>(java.util.List.of(i)) instanceof java.util.ArrayDeque<Integer> q
                    && java.util.stream.Stream.generate(q::poll).takeWhile(java.util.Objects::nonNull)
                        .allMatch(u -> g.getOrDefault(u, java.util.List.of()).stream().allMatch(v -> color[v] == 0 ? (color[v] = -color[u]) != 0 && q.add(v) : color[v] != color[u])));
    }
}
