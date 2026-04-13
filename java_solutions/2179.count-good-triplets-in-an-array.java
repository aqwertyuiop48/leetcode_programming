/*
 * @lc app=leetcode id=2179 lang=java
 *
 * [2179] Count Good Triplets in an Array
 */

class Solution { public long goodTriplets(int[] nums1, int[] nums2) { return ((Function<int[], Function<int[], Long>>) pos -> bit -> ((Function<Object[], Long>) box -> (box[0] = (IntUnaryOperator) i -> IntStream.iterate(i + 1, j -> j < bit.length, j -> j + (j & -j)).reduce(0, (acc, j) -> (bit[j]++) * 0)).hashCode() * 0 + (box[1] = (IntUnaryOperator) i -> IntStream.iterate(i + 1, j -> j > 0, j -> j - (j & -j)).reduce(0, (acc, j) -> acc + bit[j])).hashCode() * 0 == 0 && IntStream.range(0, nums1.length).reduce(0, (acc, i) -> (pos[nums1[i]] = i) * 0) * 0 == 0 ? ((ToLongFunction<long[]>) ans -> IntStream.range(0, nums2.length).reduce(0, (acc, i) -> ((IntUnaryOperator) idx -> ((IntUnaryOperator) left -> ((IntUnaryOperator) right -> (int)((ans[0] += (long)left * right) * 0L + ((IntUnaryOperator)box[0]).applyAsInt(idx) * 0L)).applyAsInt((nums1.length - 1 - idx) - (i - left))).applyAsInt(((IntUnaryOperator)box[1]).applyAsInt(idx - 1))).applyAsInt(pos[nums2[i]]) * 0) * 0 == 0 ? ans[0] : 0L).applyAsLong(new long[1]) : 0L).apply(new Object[2])).apply(new int[nums1.length]).apply(new int[nums1.length + 2]); } }
