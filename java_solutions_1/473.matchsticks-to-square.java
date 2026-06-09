/*
 * @lc app=leetcode id=473 lang=java
 *
 * [473] Matchsticks to Square
 */

class Solution {
    public boolean makesquare(int[] matchsticks) {
        return matchsticks.length < 4 || java.util.Arrays.stream(matchsticks).sum() % 4 != 0 ? false : java.util.stream.Stream.of(java.util.stream.IntStream.of(matchsticks).boxed().sorted((x, y) -> Integer.compare(y, x)).mapToInt(Integer::intValue).toArray()).map(sorted -> java.util.stream.Stream.of(0).map(_v -> new Object[]{new int[4], new java.util.concurrent.atomic.AtomicReference<java.util.function.Function<Integer, Boolean>>(), java.util.Arrays.stream(matchsticks).sum() / 4}).peek(a -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Function<Integer, Boolean>>) a[1]).set(idx -> idx == sorted.length ? true : java.util.stream.IntStream.range(0, 4).filter(i -> i == 0 || ((int[]) a[0])[i] != ((int[]) a[0])[i - 1]).anyMatch(i -> ((int[]) a[0])[i] + sorted[idx] <= (int) a[2] && java.util.stream.Stream.of(0).peek(_v -> ((int[]) a[0])[i] += sorted[idx]).map(_v -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Function<Integer, Boolean>>) a[1]).get().apply(idx + 1)).peek(_v -> ((int[]) a[0])[i] -= sorted[idx]).findFirst().get()))).map(a -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Function<Integer, Boolean>>) a[1]).get().apply(0)).findFirst().get()).findFirst().get();
    }
}
