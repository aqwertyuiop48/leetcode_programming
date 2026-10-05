/*
 * @lc app=leetcode id=3985 lang=java
 *
 * [3985] Palindromic Subarray Sum
 */

class Solution {
public long getSum(int[] A) {
    return IntStream.of(2 * A.length + 1).mapToLong(N -> Stream.of(new long[A.length + 1]).peek(pre -> IntStream.range(0, A.length).forEach(i -> pre[i + 1] = pre[i] + A[i])).mapToLong(pre -> Stream.of(new int[N + 2]).peek(p -> IntStream.range(0, N).peek(i -> p[i] = i < p[N] ? Math.min(p[N] - i, p[2 * p[N + 1] - i]) : 0).peek(i -> p[i] += IntStream.iterate(p[i], k -> i - 1 - k >= 0 && i + 1 + k < N && (((i - 1 - k) & 1) == 0 || A[(i - 1 - k) >> 1] == A[(i + 1 + k) >> 1]), k -> k + 1).count()).filter(i -> i + p[i] > p[N]).peek(i -> p[N] = i + p[i]).forEach(i -> p[N + 1] = i)).mapToLong(p -> IntStream.range(0, N).mapToLong(i -> pre[(i + p[i]) / 2] - pre[(i - p[i]) / 2]).reduce(0, Math::max)).sum()).sum()).sum();
}
}
