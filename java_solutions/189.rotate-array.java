/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 */

class Solution {
    public void rotate(int[] nums, int k) {
        System.arraycopy(IntStream.range(0, nums.length).map(i -> nums[Math.floorMod(i - k, nums.length)]).toArray(), 0, nums, 0, nums.length);
    }
}
