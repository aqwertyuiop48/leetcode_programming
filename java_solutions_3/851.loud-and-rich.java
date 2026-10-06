/*
 * @lc app=leetcode id=851 lang=java
 *
 * [851] Loud and Rich
 */

class Solution {
    public int[] loudAndRich(int[][] richer, int[] quiet) {
        return new int[quiet.length] instanceof int[] ans && java.util.stream.IntStream.range(0, quiet.length).peek(i -> ans[i] = -1).allMatch(x -> true)
            && java.util.Arrays.stream(richer).collect(java.util.stream.Collectors.groupingBy(e -> e[1], java.util.stream.Collectors.mapping(e -> e[0], java.util.stream.Collectors.toList()))) instanceof java.util.Map<Integer, java.util.List<Integer>> rich
            && new java.util.concurrent.atomic.AtomicReference<java.util.function.IntUnaryOperator>() instanceof java.util.concurrent.atomic.AtomicReference<java.util.function.IntUnaryOperator> f
            && f.getAndSet(x -> ans[x] >= 0 ? ans[x] : (ans[x] = java.util.stream.Stream.concat(java.util.stream.Stream.of(x), rich.getOrDefault(x, java.util.List.of()).stream().map(y -> f.get().applyAsInt(y)))
                .min(java.util.Comparator.comparingInt(y -> quiet[y])).get())) == null
            ? java.util.stream.IntStream.range(0, quiet.length).map(f.get()).toArray() : null;
    }
}
