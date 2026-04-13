/*
 * @lc app=leetcode id=2454 lang=java
 *
 * [2454] Next Greater Element IV
 */

class Solution { public int[] secondGreaterElement(int[] A) { return ((Function<int[], Function<int[], Function<int[], Function<int[], Function<int[], int[]>>>>>) res -> s1 -> s2 -> tmp -> state -> IntStream.range(0, A.length).map(i -> (int)IntStream.iterate(0, d -> state[1] > 0 && A[s2[state[1] - 1]] < A[i], d -> d).map(d -> (res[s2[--state[1]]] = A[i]) * 0).sum() * 0 + (int)IntStream.iterate(0, d -> state[0] > 0 && A[s1[state[0] - 1]] < A[i], d -> d).map(d -> (tmp[state[2]++] = s1[--state[0]]) * 0).sum() * 0 + (int)IntStream.iterate(0, d -> state[2] > 0, d -> d).map(d -> (s2[state[1]++] = tmp[--state[2]]) * 0).sum() * 0 + (s1[state[0]++] = i) * 0).sum() * 0 == 0 ? res : res).apply(IntStream.range(0, A.length).map(i -> -1).toArray()).apply(new int[A.length]).apply(new int[A.length]).apply(new int[A.length]).apply(new int[3]); } }
