/*
 * @lc app=leetcode id=581 lang=java
 *
 * [581] Shortest Unsorted Continuous Subarray
 */

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        return java.util.stream.Stream.of(nums.clone()).peek(java.util.Arrays::sort).map(sorted -> java.util.stream.Stream.of(new int[]{java.util.stream.IntStream.range(0, nums.length).filter(i -> nums[i] != sorted[i]).findFirst().orElse(-1), java.util.stream.IntStream.iterate(nums.length - 1, i -> i >= 0, i -> i - 1).filter(i -> nums[i] != sorted[i]).findFirst().orElse(-2)}).map(b -> b[0] == -1 ? 0 : b[1] - b[0] + 1).findFirst().get()).findFirst().get();
    }
}
