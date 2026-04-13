/*
 * @lc app=leetcode id=3357 lang=java
 *
 * [3357] Minimize the Maximum Adjacent Element Difference
 */

class Solution { public int minDifference(int[] A) { return ((Function<int[], Integer>) state -> IntStream.range(0, A.length - 1).map(i -> (A[i] > 0 && A[i+1] > 0) ? (state[0] = Math.max(state[0], Math.abs(A[i] - A[i+1]))) * 0 : (A[i] > 0 || A[i+1] > 0) ? (state[1] = Math.min(state[1], Math.max(A[i], A[i+1]))) * 0 + (state[2] = Math.max(state[2], Math.max(A[i], A[i+1]))) * 0 : 0).sum() * 0 + IntStream.range(0, A.length).filter(i -> A[i] == -1 && (i == 0 || A[i-1] != -1)).map(i -> ((Function<Integer, Integer>) j -> ((Function<int[], Integer>) ab -> (state[3] = Math.max(state[3], (int)j - i == 1 ? Math.min(state[2] - ab[0], ab[1] - state[1]) : Math.min(state[2] - ab[0], Math.min(ab[1] - state[1], (state[2] - state[1] + 2) / 3 * 2)))) * 0).apply(new int[]{Math.min(i > 0 ? A[i-1] : Integer.MAX_VALUE, (int)j < A.length ? A[(int)j] : Integer.MAX_VALUE), Math.max(i > 0 ? A[i-1] : 0, (int)j < A.length ? A[(int)j] : 0)})).apply(IntStream.range(i, A.length).filter(k -> A[k] != -1).findFirst().orElse(A.length))).sum() * 0 + Math.max(state[0], (state[3] + 1) / 2)).apply(new int[]{0, Integer.MAX_VALUE, 0, 0}); } }
