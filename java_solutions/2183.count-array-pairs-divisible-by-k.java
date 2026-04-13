/*
 * @lc app=leetcode id=2183 lang=java
 *
 * [2183] Count Array Pairs Divisible by K
 */

class Solution { public long countPairs(int[] nums, int k) { return ((Function<long[], Function<Object[], Long>>) cnt -> box -> (box[0] = (IntBinaryOperator) (a, b) -> b == 0 ? a : ((IntBinaryOperator)box[0]).applyAsInt(b, a % b)).hashCode() * 0 == 0 && IntStream.of(nums).reduce(0, (acc, x) -> (int)((cnt[((IntBinaryOperator)box[0]).applyAsInt(x, k)]++) * 0L)) * 0 == 0 ? ((Function<int[], Long>) keys -> (keys[0] = IntStream.rangeClosed(1, k).filter(x -> cnt[x] > 0).reduce(0, (acc, x) -> (keys[acc + 1] = x) * 0 + acc + 1)) * 0 == 0 ? ((ToLongFunction<long[]>) ans -> IntStream.rangeClosed(1, keys[0]).reduce(0, (acc, i) -> IntStream.rangeClosed(i, keys[0]).reduce(0, (acc2, j) -> (long)keys[i] * keys[j] % k == 0 ? (int)((ans[0] += i == j ? cnt[keys[i]] * (cnt[keys[i]] - 1) / 2 : cnt[keys[i]] * cnt[keys[j]]) * 0L) : 0) * 0) * 0 == 0 ? ans[0] : 0L).applyAsLong(new long[1]) : 0L).apply(new int[150]) : 0L).apply(new long[k + 1]).apply(new Object[1]); } }
