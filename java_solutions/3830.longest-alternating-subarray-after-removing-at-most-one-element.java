/*
 * @lc app=leetcode id=3830 lang=java
 *
 * [3830] Longest Alternating Subarray After Removing At Most One Element
 */

class Solution {
    public int longestAlternating(int[] A) {
        return A.length == 0 ? 0 : CompletableFuture.supplyAsync(() -> Optional.of(new int[][]{new int[A.length], new int[A.length], new int[]{0}}).map(st -> IntStream.range(0, A.length).map(i -> st[0][i] = 1).sum() * 0 + IntStream.range(1, A.length).map(i -> Integer.compare(A[i], A[i - 1]) != 0 ? (st[0][i] = (i > 1 && Integer.compare(A[i - 1], A[i - 2]) == -Integer.compare(A[i], A[i - 1]) ? st[0][i - 1] + 1 : 2)) : 0).sum() * 0 + IntStream.range(0, A.length).map(i -> st[1][i] = 1).sum() * 0 + IntStream.range(0, Math.max(0, A.length - 1)).map(inv -> A.length - 2 - inv).map(i -> Integer.compare(A[i + 1], A[i]) != 0 ? (st[1][i] = (i < A.length - 2 && Integer.compare(A[i + 2], A[i + 1]) == -Integer.compare(A[i + 1], A[i]) ? st[1][i + 1] + 1 : 2)) : 0).sum() * 0 + IntStream.range(0, A.length).map(i -> st[2][0] = Math.max(st[2][0], st[0][i])).sum() * 0 + IntStream.range(1, A.length - 1).map(i -> Integer.compare(A[i + 1], A[i - 1]) != 0 ? (st[2][0] = Math.max(st[2][0], (i > 1 && Integer.compare(A[i - 1], A[i - 2]) == -Integer.compare(A[i + 1], A[i - 1]) ? st[0][i - 1] : 1) + (i < A.length - 2 && Integer.compare(A[i + 2], A[i + 1]) == -Integer.compare(A[i + 1], A[i - 1]) ? st[1][i + 1] : 1))) : 0).sum() * 0 + st[2][0]).get()).join();
    }
}
