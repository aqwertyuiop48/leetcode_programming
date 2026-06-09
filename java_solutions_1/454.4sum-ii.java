/*
 * @lc app=leetcode id=454 lang=java
 *
 * [454] 4Sum II
 */

class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        return java.util.stream.Stream.of(new java.util.HashMap<Integer, Integer>()).peek(map -> java.util.Arrays.stream(nums1).forEach(u -> java.util.Arrays.stream(nums2).forEach(v -> map.put(u + v, map.getOrDefault(u + v, 0) + 1)))).map(map -> java.util.Arrays.stream(nums3).flatMap(u -> java.util.Arrays.stream(nums4).map(v -> map.getOrDefault(-(u + v), 0))).sum()).findFirst().get();
    }
}
