/*
 * @lc app=leetcode id=3312 lang=java
 *
 * [3312] Sorted GCD Pair Queries
 */

class Solution { public int[] gcdValues(int[] nums, long[] queries) { return ((Function<Integer, int[]>) max -> ((Function<int[], int[]>) divCnt -> ((Function<long[], int[]>) pref -> (int[]) new Object[]{ Arrays.stream(nums).map(num -> IntStream.rangeClosed(1, (int)Math.sqrt(num)).filter(i -> num % i == 0).map(i -> (divCnt[i]++) * 0 + (i != num / i ? (divCnt[num / i]++) * 0 : 0)).sum()).sum(), IntStream.rangeClosed(1, max).map(i -> max - i + 1).mapToLong(gcd -> pref[gcd] = (long)divCnt[gcd] * (divCnt[gcd] - 1) / 2 - IntStream.iterate(gcd * 2, m -> m <= max, m -> m + gcd).mapToLong(m -> pref[m]).sum()).sum(), IntStream.rangeClosed(1, max).mapToLong(gcd -> pref[gcd] += pref[gcd - 1]).sum(), Arrays.stream(queries).mapToInt(q -> IntStream.iterate(Integer.highestOneBit(max | 1) << 1, step -> step > 0, step -> step >> 1).reduce(0, (pos, step) -> pos + step <= max && pref[pos + step] <= q ? pos + step : pos) + 1).toArray() }[3] ).apply(new long[max + 1]) ).apply(new int[max + 1]) ).apply(Arrays.stream(nums).max().orElse(0)); } }
