/*
 * @lc app=leetcode id=2521 lang=kotlin
 *
 * [2521] Distinct Prime Factors of Product of Array
 */

import java.math.* class Solution {fun distinctPrimeFactors(nums: IntArray) = (IntStream.iterate(2) { it + 1 }.filter { i -> IntStream.rangeClosed(2, Math.sqrt(i.toDouble()).toInt()).allMatch { j -> i % j != 0 } }.limit(200).boxed().collect(Collectors.toList()) to nums.fold(BigInteger.ONE) { acc, num -> acc.multiply(BigInteger.valueOf(num.toLong())) }).let { (primes, product) -> primes.count { product.mod(BigInteger.valueOf(it.toLong())) == BigInteger.ZERO } }}

