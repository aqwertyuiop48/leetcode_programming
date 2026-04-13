/*
 * @lc app=leetcode id=1752 lang=java
 *
 * [1752] Check if Array Is Sorted and Rotated
 */

class Solution {
    public boolean check(int[] nums) {
        return IntStream.range(0, nums.length)
            .filter(i -> nums[i] > nums[(i + 1) % nums.length])
            .count() <= 1;
    }
}
