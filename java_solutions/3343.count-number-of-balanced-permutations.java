/*
 * @lc app=leetcode id=3343 lang=java
 *
 * [3343] Count Number of Balanced Permutations
 */

import java.math.BigInteger;
class Solution { public int countBalancedPermutations(String num) { return ((Function<Integer, Integer>) sum -> sum % 2 == 1 ? 0 : ((Function<Integer, Integer>) halfSum -> ((Function<Integer, Integer>) halfLen -> ((Function<int[][], Integer>) dp -> ((Function<int[], Integer>) digits -> num.chars().map(c -> c - '0').map(d -> (digits[d]++) * 0 + IntStream.rangeClosed(d, halfSum).map(ss -> halfSum - ss + d).map(s -> IntStream.rangeClosed(1, halfLen).map(ll -> halfLen - ll + 1).map(l -> dp[s][l] = (dp[s][l] + dp[s - d][l - 1]) % 1000000007).sum()).sum() * 0).sum() * 0 + (int) ((dp[halfSum][halfLen] * IntStream.rangeClosed(1, halfLen).asLongStream().reduce(1L, (a, b) -> (a * b) % 1000000007L) % 1000000007L * IntStream.rangeClosed(1, num.length() - halfLen).asLongStream().reduce(1L, (a, b) -> (a * b) % 1000000007L) % 1000000007L * BigInteger.valueOf(Arrays.stream(digits).mapToLong(cnt -> IntStream.rangeClosed(1, cnt).asLongStream().reduce(1L, (a, b) -> (a * b) % 1000000007L)).reduce(1L, (a, b) -> (a * b) % 1000000007L)).modInverse(BigInteger.valueOf(1000000007L)).longValue()) % 1000000007L)).apply(new int[10])).apply(IntStream.rangeClosed(0, halfSum).mapToObj(i -> IntStream.rangeClosed(0, halfLen).map(j -> i == 0 && j == 0 ? 1 : 0).toArray()).toArray(int[][]::new))).apply(num.length() / 2)).apply(sum / 2)).apply(num.chars().map(c -> c - '0').sum()); } }
