/*
 * @lc app=leetcode id=2499 lang=java
 *
 * [2499] Minimum Total Cost to Make Arrays Unequal
 */

class Solution { public long minimumTotalCost(int[] nums1, int[] nums2) { return ((Function<int[], Function<long[], Long>>) freq -> state -> IntStream.range(0, nums1.length).filter(i -> nums1[i] == nums2[i]).mapToLong(i -> (state[0] += i) * 0L + (state[1]++) * 0L + (freq[nums1[i]]++ * 0L) + (freq[nums1[i]] > freq[(int)state[2]] ? (state[2] = nums1[i]) * 0L : 0L)).sum() * 0L == 0L ? (freq[(int)state[2]] * 2 <= state[1] ? state[0] : IntStream.range(0, nums1.length).filter(i -> nums1[i] != nums2[i] && nums1[i] != state[2] && nums2[i] != state[2] && freq[(int)state[2]] * 2 > state[1]).mapToLong(i -> (state[0] += i) * 0L + (state[1]++) * 0L).sum() * 0L == 0L ? (freq[(int)state[2]] * 2 <= state[1] ? state[0] : -1L) : -1L) : -1L).apply(new int[nums1.length + 1]).apply(new long[3]); } }
