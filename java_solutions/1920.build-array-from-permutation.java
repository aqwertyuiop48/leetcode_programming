/*
 * @lc app=leetcode id=1920 lang=java
 *
 * [1920] Build Array from Permutation
 */

class Solution {
    public int[] buildArray(int[] nums) {
        return IntStream.range(0, nums.length)
            .map(i -> nums[nums[i]])
            .toArray();
    }
}
