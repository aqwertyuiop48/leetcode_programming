/*
 * @lc app=leetcode id=55 lang=java
 *
 * [55] Jump Game
 */

class Solution {
    public boolean canJump(int[] nums) {
        return java.util.stream.IntStream.range(0, nums.length).boxed().reduce(0, (max, i) -> i > max ? -1 : Math.max(max, i + nums[i]), Integer::max) >= nums.length - 1;
    }
}
