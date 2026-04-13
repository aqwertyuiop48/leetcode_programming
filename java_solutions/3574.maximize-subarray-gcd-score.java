/*
 * @lc app=leetcode id=3574 lang=java
 *
 * [3574] Maximize Subarray GCD Score
 */

class Solution {
    public long maxGCDScore(int[] A, int k) {
        return CompletableFuture.supplyAsync(() -> Optional.of(new IntBinaryOperator[1]).map(gcd -> Optional.of(gcd[0] = (a, b) -> b == 0 ? a : gcd[0].applyAsInt(b, a % b)).map(iGcd -> IntStream.range(0, A.length).mapToLong(i -> Optional.of(new int[]{A[i], Integer.MAX_VALUE, 0}).map(st -> IntStream.range(i, A.length).mapToLong(j -> (st[0] = gcd[0].applyAsInt(st[0], A[j])) * 0 + ((A[j] & -A[j]) < st[1] ? (st[1] = (A[j] & -A[j])) * 0 + (st[2] = 1) * 0 : ((A[j] & -A[j]) == st[1] ? (st[2]++) * 0 : 0)) * 0 == 0 ? 1L * st[0] * (st[2] <= k ? 2 : 1) * (j - i + 1) : 0L).max().orElse(0L)).get()).max().orElse(0L)).get()).get()).join();
    }
}
