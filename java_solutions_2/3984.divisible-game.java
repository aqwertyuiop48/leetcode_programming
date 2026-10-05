/*
 * @lc app=leetcode id=3984 lang=java
 *
 * [3984] Divisible Game
 */

class Solution {
public int divisibleGame(int[] nums) {
    return IntStream.concat(Arrays.stream(nums).flatMap(x -> IntStream.concat(IntStream.rangeClosed(2, (int) Math.sqrt(x)).filter(d -> x % d == 0).flatMap(d -> IntStream.of(d, x / d)), x > 1 ? IntStream.of(x) : IntStream.empty())), IntStream.of(Arrays.stream(nums).max().getAsInt() + 1)).distinct().mapToObj(k -> new long[]{Arrays.stream(nums).collect(() -> new long[]{0, Long.MIN_VALUE}, (s, x) -> s[1] = Math.max(s[1], s[0] = (s[0] < 0 ? 0 : s[0]) + (x % k == 0 ? x : -x)), (a, b) -> {})[1], k}).min(Comparator.<long[]>comparingLong(a -> -a[0]).thenComparingLong(a -> a[1])).map(b -> (int) ((((b[0] % 1_000_000_007L) + 1_000_000_007L) % 1_000_000_007L) * b[1] % 1_000_000_007L)).get();
}
}
