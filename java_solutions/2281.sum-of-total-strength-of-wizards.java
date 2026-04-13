/*
 * @lc app=leetcode id=2281 lang=java
 *
 * [2281] Sum of Total Strength of Wizards
 */

class Solution { public int totalStrength(int[] A) { return ((Function<int[], Function<long[], Function<long[], Integer>>>) stack -> state -> acc -> IntStream.rangeClosed(0, A.length).map(r -> (int)((state[2] = r < A.length ? A[r] : 0) * 0L + (state[0] = (state[0] + state[2]) % 1000000007L) * 0L + (acc[r + 1] = (state[0] + acc[r]) % 1000000007L) * 0L + IntStream.iterate(0, dummy -> state[3] >= 0 && A[stack[(int)state[3]]] > state[2], dummy -> dummy + 1).mapToLong(dummy -> ((Function<Integer, Long>) i -> ((Function<Integer, Long>) l -> ((Function<Long, Long>) lacc -> ((Function<Long, Long>) racc -> (state[1] = (state[1] + ((racc * (i - l)) % 1000000007L - (lacc * (r - i)) % 1000000007L + 1000000007L) % 1000000007L * A[i] % 1000000007L) % 1000000007L) * 0L).apply((acc[r] - acc[i] + 1000000007L) % 1000000007L)).apply(l < 0 ? acc[i] : (acc[i] - acc[l] + 1000000007L) % 1000000007L)).apply(state[3] < 0 ? -1 : stack[(int)state[3]])).apply(stack[(int)state[3]--])).sum() * 0L + (stack[(int)++state[3]] = r) * 0L)).sum() * 0 == 0 ? (int)(state[1] % 1000000007L) : 0).apply(new int[A.length + 1]).apply(new long[]{0, 0, 0, -1}).apply(new long[A.length + 2]); } }
