/*
 * @lc app=leetcode id=2426 lang=java
 *
 * [2426] Number of Pairs Satisfying Inequality
 */

class Solution { public long numberOfPairs(int[] nums1, int[] nums2, int diff) { return ((Function<int[], Function<int[], Long>>) diffArr -> unique -> ((Function<int[], Function<long[], Long>>) bit -> ans -> IntStream.range(0, nums1.length).mapToLong(i -> (ans[0] += IntStream.iterate(Arrays.binarySearch(unique, diffArr[i] + diff) + 1, idx -> idx > 0, idx -> idx - (idx & -idx)).map(idx -> bit[idx]).sum()) * 0L + IntStream.iterate(Arrays.binarySearch(unique, diffArr[i]) + 1, idx -> idx <= unique.length, idx -> idx + (idx & -idx)).map(idx -> (bit[idx] += 1) * 0).sum() * 0L).sum() * 0L == 0L ? ans[0] : 0L).apply(new int[unique.length + 1]).apply(new long[1])).apply(IntStream.range(0, nums1.length).map(i -> nums1[i] - nums2[i]).toArray()).apply(IntStream.concat(IntStream.range(0, nums1.length).map(i -> nums1[i] - nums2[i]), IntStream.range(0, nums1.length).map(i -> nums1[i] - nums2[i] + diff)).distinct().sorted().toArray()); } }
