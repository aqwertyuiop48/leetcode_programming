/*
 * @lc app=leetcode id=2057 lang=java
 *
 * [2057] Smallest Index With Equal Value
 */

class Solution {
    public int smallestEqual(int[] nums) {
        return IntStream.range(0, nums.length)
            .filter(i -> i % 10 == nums[i])
            .findFirst()
            .orElse(-1);
    }
}
