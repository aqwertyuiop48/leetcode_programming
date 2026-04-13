/*
 * @lc app=leetcode id=3134 lang=java
 *
 * [3134] Find the Median of the Uniqueness Array
 */

class Solution { public int medianOfUniquenessArray(int[] A) { return ((IntFunction<Integer>) MAX -> ((Function<IntToLongFunction, Integer>) atMost -> ((Function<int[], Integer>) bs -> IntStream.iterate(0, step -> bs[0] < bs[1], step -> step + 1).reduce(0, (dummy, step) -> (int)((atMost.applyAsLong((bs[0] + bs[1]) / 2) * 2L >= (long) A.length * (A.length + 1L) / 2L ? (bs[1] = (bs[0] + bs[1]) / 2) : (bs[0] = (bs[0] + bs[1]) / 2 + 1)) * 0)) * 0 == 0 ? bs[0] : bs[0]).apply(new int[]{1, A.length})).apply((IntToLongFunction) k -> ((Function<long[], Long>) state -> ((Function<int[], Long>) count -> IntStream.range(0, A.length).reduce(0, (dummy, j) -> (int)((state[1] += (count[A[j]]++ == 0 ? 1 : 0)) * 0L + IntStream.iterate(0, d -> state[1] > k, d -> d + 1).reduce(0, (d2, d3) -> (int)((state[1] -= (--count[A[(int)state[0]++]] == 0 ? 1 : 0)) * 0L)) * 0L + (state[2] += j - state[0] + 1) * 0L)) * 0L == 0L ? state[2] : 0L).apply(new int[MAX])).apply(new long[3]))).apply(Arrays.stream(A).max().getAsInt() + 1); } }
