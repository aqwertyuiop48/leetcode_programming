/*
 * @lc app=leetcode id=324 lang=java
 *
 * [324] Wiggle Sort II
 */

class Solution {
    public void wiggleSort(int[] nums) { if (java.util.Optional.of(java.util.Arrays.stream(nums).sorted().toArray()).map(c -> java.util.stream.IntStream.range(0, nums.length).peek(i -> nums[i] = c[i % 2 == 0 ? (nums.length - 1) / 2 - i / 2 : nums.length - 1 - i / 2]).count()).get() >= 0) {} }
}
