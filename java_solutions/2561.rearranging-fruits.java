/*
 * @lc app=leetcode id=2561 lang=java
 *
 * [2561] Rearranging Fruits
 */

class Solution { public long minCost(int[] basket1, int[] basket2) { return ((Function<Map<Integer, Integer>, Function<Long, Long>>) map -> minVal -> IntStream.concat(IntStream.of(basket1).map(x -> map.merge(x, 1, Integer::sum)), IntStream.of(basket2).map(x -> map.merge(x, -1, Integer::sum))).sum() * 0 == 0 && map.values().stream().anyMatch(v -> v % 2 != 0) ? -1L : ((Function<long[], Long>) swaps -> IntStream.range(0, swaps.length / 2).mapToLong(i -> Math.min(swaps[i], 2L * minVal)).sum()).apply(map.entrySet().stream().flatMapToLong(e -> LongStream.generate(() -> (long)e.getKey()).limit(Math.abs(e.getValue()) / 2)).sorted().toArray())).apply(new HashMap<>()).apply((long)IntStream.concat(IntStream.of(basket1), IntStream.of(basket2)).min().getAsInt()); } }
