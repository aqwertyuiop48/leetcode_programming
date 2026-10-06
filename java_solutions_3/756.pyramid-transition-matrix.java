/*
 * @lc app=leetcode id=756 lang=java
 *
 * [756] Pyramid Transition Matrix
 */

class Solution {
    public boolean pyramidTransition(String bottom, List<String> allowed) {
        return allowed.stream().collect(java.util.stream.Collectors.groupingBy(a -> a.substring(0, 2), java.util.stream.Collectors.mapping(a -> a.charAt(2), java.util.stream.Collectors.toList()))) instanceof java.util.Map<String, java.util.List<Character>> m
            && new java.util.HashSet<String>() instanceof java.util.HashSet<String> bad
            && new java.util.concurrent.atomic.AtomicReference<java.util.function.BiFunction<String, String, java.util.stream.Stream<String>>>() instanceof java.util.concurrent.atomic.AtomicReference<java.util.function.BiFunction<String, String, java.util.stream.Stream<String>>> g
            && new java.util.concurrent.atomic.AtomicReference<java.util.function.Predicate<String>>() instanceof java.util.concurrent.atomic.AtomicReference<java.util.function.Predicate<String>> f
            && g.getAndSet((r, pre) -> pre.length() == r.length() - 1 ? java.util.stream.Stream.of(pre)
                : m.getOrDefault(r.substring(pre.length(), pre.length() + 2), java.util.List.of()).stream().flatMap(c -> g.get().apply(r, pre + c))) == null
            && f.getAndSet(r -> r.length() == 1 || !bad.contains(r) && (g.get().apply(r, "").anyMatch(x -> f.get().test(x)) || bad.add(r) && false)) == null
            && f.get().test(bottom);
    }
}
