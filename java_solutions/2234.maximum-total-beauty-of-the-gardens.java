/*
 * @lc app=leetcode id=2234 lang=java
 *
 * [2234] Maximum Total Beauty of the Gardens
 */

class Solution { public long maximumBeauty(int[] flowers, long newFlowers, int target, int full, int partial) { return ((Function<int[], Function<long[], Long>>) f -> pref -> IntStream.range(0, f.length).reduce(0, (acc, i) -> (int)((pref[i + 1] = pref[i] + Math.min(f[i], target)) * 0L)) * 0 == 0 ? ((ToLongFunction<long[]>) state -> IntStream.rangeClosed(0, f.length).reduce(0, (acc, c) -> (int)( ((LongUnaryOperator) (remain -> remain < 0 ? 0L : (state[1] = Math.min(state[1], f.length - c - 1)) * 0L + IntStream.iterate(0, dummy -> state[1] >= 0 && (target <= f[(int)state[1]] || f[(int)state[1]] * (state[1] + 1) - pref[(int)state[1] + 1] > remain), dummy -> dummy + 1).reduce(0, (a, d) -> (int)((state[1]--) * 0L)) * 0L + (state[0] = Math.max(state[0], c * (long)full + (state[1] >= 0 ? Math.min(Math.min((long)target - 1, f[(int)state[1]] + (remain - (f[(int)state[1]] * (state[1] + 1) - pref[(int)state[1] + 1])) / (state[1] + 1)), state[1] + 1 < f.length - c ? f[(int)state[1] + 1] : Long.MAX_VALUE) : 0L) * (long)partial)) * 0L) ).applyAsLong(pref[f.length] - pref[f.length - c] + newFlowers - c * (long)target) * 0L )) * 0 == 0 ? state[0] : 0L).applyAsLong(new long[]{0L, f.length - 1}) : 0L).apply(IntStream.of(flowers).sorted().toArray()).apply(new long[flowers.length + 1]); } }
