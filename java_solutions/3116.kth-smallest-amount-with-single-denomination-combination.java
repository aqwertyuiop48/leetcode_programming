/*
 * @lc app=leetcode id=3116 lang=java
 *
 * [3116] Kth Smallest Amount With Single Denomination Combination
 */

class Solution { public long findKthSmallest(int[] coins, int k) { return ((Function<Object[], Long>) gcdBox -> ((Function<LongBinaryOperator, Long>) gcd -> ((Function<LongBinaryOperator, Long>) lcm -> ((Function<long[], Long>) lcms -> ((Function<Object[], Long>) bsBox -> ((Function<Function<long[], Long>, Long>) bs -> bs.apply(new long[]{1L, Long.MAX_VALUE})).apply((Function<long[], Long>) (bsBox[0] = (Function<long[], Long>) state -> state[0] >= state[1] ? state[0] : ((LongUnaryOperator) mid -> Arrays.stream(lcms).map(l -> mid / l).sum() < k ? ((Function<long[], Long>) bsBox[0]).apply(new long[]{mid + 1L, state[1]}) : ((Function<long[], Long>) bsBox[0]).apply(new long[]{state[0], mid})).applyAsLong(state[0] + (state[1] - state[0]) / 2L)))).apply(new Object[1])).apply(IntStream.range(1, 1 << coins.length).mapToLong(i -> IntStream.range(0, coins.length).filter(j -> (i & (1 << j)) > 0).mapToLong(j -> (long) coins[j]).reduce(1L, lcm) * (Integer.bitCount(i) % 2 == 1 ? 1L : -1L)).toArray())).apply((a, b) -> a * (b / gcd.applyAsLong(a, b)))).apply((LongBinaryOperator) (gcdBox[0] = (LongBinaryOperator) (a, b) -> b == 0L ? a : ((LongBinaryOperator) gcdBox[0]).applyAsLong(b, a % b)))).apply(new Object[1]); } }
