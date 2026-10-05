/*
 * @lc app=leetcode id=4002 lang=java
 *
 * [4002] Count Valid Sequences
 */

class Solution {
    public int countValidSequences(int n, int k) {
        return n < k ? 0 : (int) java.util.stream.Stream.<long[]>of(new long[n + 1])
            .mapToLong(fact -> java.util.stream.Stream.<long[]>of(new long[n + 1])
                .peek(invFact -> fact[0] = 1L)
                .peek(invFact -> invFact[0] = 1L)
                .peek(invFact -> java.util.stream.IntStream.rangeClosed(1, n).forEach(i -> fact[i] = (fact[i - 1] * i) % 1000000007))
                .peek(invFact -> invFact[n] = java.math.BigInteger.valueOf(fact[n]).modInverse(java.math.BigInteger.valueOf(1000000007)).longValue())
                .peek(invFact -> java.util.stream.IntStream.range(1, n).map(i -> n - i).forEach(i -> invFact[i] = (invFact[i + 1] * (i + 1)) % 1000000007))
                .mapToLong(invFact -> java.util.stream.Stream.of(fact[n - 1] * invFact[k - 1] % 1000000007 * invFact[n - k] % 1000000007)
                    .mapToLong(total -> (total - ((n - k) % 2 == 0 ? fact[(n - k) / 2 + k - 1] * invFact[k - 1] % 1000000007 * invFact[(n - k) / 2] % 1000000007 : 0L) + 1000000007) % 1000000007)
                    .findFirst().getAsLong()
                ).findFirst().getAsLong()
            ).findFirst().getAsLong();
    }
}
