/*
 * @lc app=leetcode id=204 lang=java
 *
 * [204] Count Primes
 */

class Solution {
    public int countPrimes(int n) {
        return n < 3 ? 0 : Optional.of(new BitSet(n))
            .map(sieve -> IntStream.range(2, (int) Math.sqrt(n) + 1)
                .filter(i -> !sieve.get(i))
                .peek(i -> IntStream.iterate(i * i, j -> j < n, j -> j + i).forEach(sieve::set))
                .count() >= 0 ? n - 2 - sieve.cardinality() : 0)
            .get();
    }
}
