/*
 * @lc app=leetcode id=518 lang=java
 *
 * [518] Coin Change II
 */

record Solution() {
    public int change(int amount, int[] coins) {
        return java.util.Arrays.stream(coins).reduce(java.util.stream.Stream.of(new int[amount + 1]).peek(a -> a[0] = 1).findFirst().get(), (dp, c) -> java.util.stream.Stream.of(dp).peek(arr -> java.util.stream.IntStream.rangeClosed(c, amount).forEach(i -> arr[i] += arr[i - c])).findFirst().get(), (a, b) -> a)[amount];
    }
}
