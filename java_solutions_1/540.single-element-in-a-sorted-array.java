/*
 * @lc app=leetcode id=540 lang=java
 *
 * [540] Single Element in a Sorted Array
 */

class Solution {
    public int singleNonDuplicate(int[] nums) {
        return nums[java.util.stream.Stream.iterate(new int[]{0, nums.length - 1}, b -> java.util.stream.Stream.of(b[0] + (b[1] - b[0]) / 2).map(m -> m % 2 == 1 ? m - 1 : m).map(m -> nums[m] == nums[m + 1] ? new int[]{m + 2, b[1]} : new int[]{b[0], m}).findFirst().get()).dropWhile(b -> b[0] < b[1]).findFirst().get()[0]];
    }
}
