/*
 * @lc app=leetcode id=756 lang=java
 *
 * [756] Pyramid Transition Matrix
 */

class Solution {
    public boolean pyramidTransition(String bottom, List<String> allowed) {
        return allowed.stream().collect(java.util.stream.Collectors.groupingBy(a -> a.substring(0, 2), java.util.stream.Collectors.mapping(a -> a.charAt(2), java.util.stream.Collectors.toList()))) instanceof java.util.Map<String, java.util.List<Character>> m
            && !java.util.stream.Stream.iterate(java.util.Set.of(bottom), l -> l.stream().flatMap(r -> java.util.stream.IntStream.range(0, r.length() - 1).boxed()
                .reduce(java.util.List.of(""), (pre, i) -> pre.stream().flatMap(p -> m.getOrDefault(r.substring(i, i + 2), java.util.List.of()).stream().map(c -> p + c)).toList(), (a, b) -> a).stream())
                .collect(java.util.stream.Collectors.toSet())).skip(bottom.length() - 1).findFirst().get().isEmpty();
    }
}
