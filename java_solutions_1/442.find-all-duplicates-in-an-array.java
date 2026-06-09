/*
 * @lc app=leetcode id=442 lang=java
 *
 * [442] Find All Duplicates in an Array
 */

class Solution {
    public java.util.List<Integer> findDuplicates(int[] nums) {
        return java.util.stream.Stream.of(new java.util.ArrayList<Integer>()).peek(res -> java.util.stream.IntStream.range(0, nums.length).forEach(i -> java.util.stream.Stream.of(Math.abs(nums[i]) - 1).peek(idx -> java.util.stream.Stream.of(0).filter(_v -> nums[idx] < 0).forEach(_v -> res.add(idx + 1))).forEach(idx -> nums[idx] = -Math.abs(nums[idx])))).findFirst().get();
    }
}
