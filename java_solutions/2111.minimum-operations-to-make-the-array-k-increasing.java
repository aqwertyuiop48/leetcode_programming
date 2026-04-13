/*
 * @lc app=leetcode id=2111 lang=java
 *
 * [2111] Minimum Operations to Make the Array K-Increasing
 */

class Solution {
    public int kIncreasing(int[] arr, int k) {
        return arr.length - IntStream.range(0, k).map(i -> ((Function<int[], ToIntFunction<int[]>>) mono -> len -> IntStream.iterate(i, j -> j < arr.length, j -> j + k).reduce(0, (acc, j) -> ((ToIntFunction<int[]>) bs -> IntStream.iterate(0, d -> bs[0] <= bs[1], d -> d + 1).reduce(0, (a, d) -> ((IntUnaryOperator) mid -> mono[mid] <= arr[j] ? (bs[0] = mid + 1) * 0 : (bs[1] = mid - 1) * 0).applyAsInt((bs[0] + bs[1]) / 2) * 0) * 0 == 0 ? (mono[bs[0]] = arr[j]) * 0 + (bs[0] == len[0] ? len[0]++ : 0) * 0 : 0).applyAsInt(new int[]{0, len[0] - 1}) * 0) * 0 == 0 ? len[0] : 0).apply(new int[arr.length]).applyAsInt(new int[]{0})).sum();
    }
}
