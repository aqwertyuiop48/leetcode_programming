/*
 * @lc app=leetcode id=638 lang=java
 *
 * [638] Shopping Offers
 */

class Solution {
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        return new java.util.HashMap<java.util.List<Integer>, Integer>() instanceof java.util.HashMap<java.util.List<Integer>, Integer> memo
            && new java.util.concurrent.atomic.AtomicReference<java.util.function.Function<java.util.List<Integer>, Integer>>() instanceof java.util.concurrent.atomic.AtomicReference<java.util.function.Function<java.util.List<Integer>, Integer>> f
            && f.getAndSet(need -> memo.containsKey(need) ? memo.get(need)
                : java.util.Optional.of(Math.min(java.util.stream.IntStream.range(0, price.size()).map(i -> price.get(i) * need.get(i)).sum(),
                    special.stream().filter(s -> java.util.stream.IntStream.range(0, need.size()).allMatch(i -> s.get(i) <= need.get(i)))
                        .mapToInt(s -> s.get(s.size() - 1) + f.get().apply(java.util.stream.IntStream.range(0, need.size()).mapToObj(i -> need.get(i) - s.get(i)).toList()))
                        .min().orElse(Integer.MAX_VALUE)))
                    .map(v -> memo.merge(need, v, (x, y) -> x)).get()) == null
            ? f.get().apply(needs) : 0;
    }
}
