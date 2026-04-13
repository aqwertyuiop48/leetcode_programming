/*
 * @lc app=leetcode id=2972 lang=java
 *
 * [2972] Count the Number of Incremovable Subarrays II
 */

class Solution { public long incremovableSubarrayCount(int[] A) { return ((Function<Integer, Long>) i -> i == A.length - 1 ? 1L * A.length * (A.length + 1) / 2 : ((Function<long[], Long>) state -> IntStream.iterate(A.length - 1, j -> j >= 0 && (j == A.length - 1 || A[j] < A[j + 1]), j -> j - 1).mapToLong(j -> (state[0] -= IntStream.iterate((int)state[0], x -> x >= 0 && A[x] >= A[j], x -> x - 1).count()) * 0L + (state[1] += state[0] + 2) * 0L).sum() * 0L == 0L ? state[1] : 0L).apply(new long[]{i, i + 2})).apply((int) IntStream.range(0, A.length - 1).takeWhile(idx -> A[idx] < A[idx + 1]).count()); } }
