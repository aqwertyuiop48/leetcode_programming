/*
 * @lc app=leetcode id=2902 lang=java
 *
 * [2902] Count of Sub-Multisets With Bounded Sum
 */

class Solution { public int countSubMultisets(List<Integer> nums, int l, int r) { return ((Function<int[], Integer>) freq -> ((Function<long[], Integer>) cache -> IntStream.rangeClosed(0, r).reduce(0, (acc, num) -> freq[num] > 0 ? (num == 0 ? IntStream.rangeClosed(0, r).reduce(0, (acc2, i) -> (int)((cache[i] = (cache[i] * (freq[0] + 1)) % 1000000007L) * 0L)) * 0 : ((Function<long[], Integer>) pSum -> IntStream.rangeClosed(0, r).reduce(0, (acc2, i) -> (int)((pSum[i] = (cache[i] + (i >= num ? pSum[i - num] : 0L)) % 1000000007L) * 0L)) * 0 + IntStream.rangeClosed(0, r).reduce(0, (acc2, i) -> (int)((cache[i] = (pSum[i] - (i >= (freq[num] + 1) * num ? pSum[i - (freq[num] + 1) * num] : 0L) + 1000000007L) % 1000000007L) * 0L)) * 0).apply(new long[r + 1])) : 0) * 0 == 0 ? (int)(IntStream.rangeClosed(l, r).mapToLong(i -> cache[i]).sum() % 1000000007L) : 0).apply(((Function<long[], long[]>) c -> (c[0] = 1L) * 0 == 0 ? c : c).apply(new long[r + 1]))).apply(((Function<int[], int[]>) f -> IntStream.range(0, nums.size()).reduce(0, (acc, i) -> (nums.get(i) <= r ? f[nums.get(i)]++ : 0) * 0) * 0 == 0 ? f : f).apply(new int[r + 1])); } }
