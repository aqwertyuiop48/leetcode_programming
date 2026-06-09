/*
 * @lc app=leetcode id=526 lang=java
 *
 * [526] Beautiful Arrangement
 */

class Solution {
    public int countArrangement(int n) {
        return java.util.stream.Stream.of(new Object[]{new java.util.concurrent.atomic.AtomicReference<java.util.function.BiFunction<Integer, Integer, Integer>>()}).peek(a -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.BiFunction<Integer, Integer, Integer>>) a[0]).set((mask, idx) -> idx > n ? 1 : java.util.stream.IntStream.rangeClosed(1, n).filter(i -> (mask & (1 << i)) == 0 && (i % idx == 0 || idx % i == 0)).map(i -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.BiFunction<Integer, Integer, Integer>>) a[0]).get().apply(mask | (1 << i), idx + 1)).sum())).map(a -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.BiFunction<Integer, Integer, Integer>>) a[0]).get().apply(0, 1)).findFirst().get();
    }
}
