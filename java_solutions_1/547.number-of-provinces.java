/*
 * @lc app=leetcode id=547 lang=java
 *
 * [547] Number of Provinces
 */

class Solution {
    public int findCircleNum(int[][] isConnected) {
        return java.util.stream.Stream.of(0).map(_v -> new Object[]{new boolean[isConnected.length], new java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<Integer>>()}).peek(a -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<Integer>>) a[1]).set(i -> java.util.stream.Stream.of(0).peek(_x -> ((boolean[]) a[0])[i] = true).forEach(_x -> java.util.stream.IntStream.range(0, isConnected.length).filter(j -> isConnected[i][j] == 1 && !((boolean[]) a[0])[j]).forEach(((java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<Integer>>) a[1]).get()::accept)))).map(a -> (int) java.util.stream.IntStream.range(0, isConnected.length).filter(i -> !((boolean[]) a[0])[i]).peek(i -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<Integer>>) a[1]).get().accept(i)).count()).findFirst().get();
    }
}
