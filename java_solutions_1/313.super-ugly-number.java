/*
 * @lc app=leetcode id=313 lang=java
 *
 * [313] Super Ugly Number
 */

// @lc code=start
class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        return (int) java.util.stream.IntStream.range(1, n).boxed().reduce(java.util.stream.Stream.of(0).map(_v -> new long[][]{new long[n], new long[primes.length]}).peek(a -> a[0][0] = 1).findFirst().get(), (a, i) -> java.util.stream.Stream.of(0).map(_v -> a).peek(x -> x[0][i] = java.util.stream.IntStream.range(0, primes.length).mapToLong(j -> x[0][(int)x[1][j]] * primes[j]).min().getAsLong()).peek(x -> java.util.stream.IntStream.range(0, primes.length).forEach(j -> x[1][j] += x[0][i] == x[0][(int)x[1][j]] * primes[j] ? 1 : 0)).findFirst().get(), (a, b) -> b)[0][n - 1];
    }
}
// @lc code=end
