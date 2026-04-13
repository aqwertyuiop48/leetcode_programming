/*
 * @lc app=leetcode id=3855 lang=java
 *
 * [3855] Sum of K-Digit Numbers in a Range
 */

class Solution {
    public int sumOfNumbers(int l, int r, int k) {
        return CompletableFuture.supplyAsync(() -> Optional.of(1000000007L).map(mod -> Optional.of((BiFunction<Long, Long, Long>[]) new BiFunction[1]).map(pow -> Optional.of(pow[0] = (b, e) -> e == 0L ? 1L : (e % 2L == 1L ? ((b % mod) * pow[0].apply(((b % mod) * (b % mod)) % mod, e / 2L)) % mod : pow[0].apply(((b % mod) * (b % mod)) % mod, e / 2L))).map(pInit -> Optional.of((long) r - l + 1L).map(count -> Map.of("ans", (int) (((((((long) (l + r) * count / 2L) % mod) * pow[0].apply(count, (long) k - 1L)) % mod) * (((pow[0].apply(10L, (long) k) - 1L + mod) % mod * pow[0].apply(9L, mod - 2L)) % mod)) % mod)).get("ans")).get()).get()).get()).get()).join();
    }
}
