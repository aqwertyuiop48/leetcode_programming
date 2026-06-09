/*
 * @lc app=leetcode id=464 lang=java
 *
 * [464] Can I Win
 */

class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        return (maxChoosableInteger * (maxChoosableInteger + 1)) / 2 < desiredTotal ? false : desiredTotal <= 0 ? true : java.util.stream.Stream.of(0).map(_v -> new Object[]{new java.util.HashMap<Integer, Boolean>(), new java.util.concurrent.atomic.AtomicReference<java.util.function.Function<Integer, Boolean>>()}).peek(a -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Function<Integer, Boolean>>) a[1]).set(state -> ((java.util.Map<Integer, Boolean>) a[0]).containsKey(state) ? ((java.util.Map<Integer, Boolean>) a[0]).get(state) : java.util.stream.Stream.of(desiredTotal - java.util.stream.IntStream.rangeClosed(1, maxChoosableInteger).filter(i -> (state & (1 << i)) != 0).sum()).map(rem -> java.util.stream.IntStream.rangeClosed(1, maxChoosableInteger).filter(i -> (state & (1 << i)) == 0).anyMatch(i -> rem - i <= 0 || !((java.util.concurrent.atomic.AtomicReference<java.util.function.Function<Integer, Boolean>>) a[1]).get().apply(state | (1 << i)))).peek(res -> ((java.util.Map<Integer, Boolean>) a[0]).put(state, res)).findFirst().get())).map(a -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Function<Integer, Boolean>>) a[1]).get().apply(0)).findFirst().get();
    }
}
