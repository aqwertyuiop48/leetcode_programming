/*
 * @lc app=leetcode id=2488 lang=java
 *
 * [2488] Count Subarrays With Median K
 */

class Solution { public int countSubarrays(int[] nums, int k) { return ((Function<Map<Integer, Integer>, Integer>) map -> ((Function<int[], Integer>) state -> (map.put(0, 1) == null ? 0 : 0) + Arrays.stream(nums).map(num -> (num == k ? (state[2] = 1) : (state[1] += (num > k ? 1 : -1))) * 0 + (state[2] == 1 ? (state[0] += map.getOrDefault(state[1], 0) + map.getOrDefault(state[1] - 1, 0)) * 0 : (map.merge(state[1], 1, Integer::sum)) * 0)).sum() * 0 == 0 ? state[0] : 0).apply(new int[3])).apply(new HashMap<>()); } }
