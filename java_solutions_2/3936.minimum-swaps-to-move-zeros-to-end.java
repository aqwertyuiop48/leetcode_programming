/*
 * @lc app=leetcode id=3936 lang=java
 *
 * [3936] Minimum Swaps to Move Zeros to End
 */

class Solution {
public int minimumSwaps(int[] nums) {
    return (int) IntStream.range(nums.length - (int) Arrays.stream(nums).filter(x -> x == 0).count(), nums.length).filter(i -> nums[i] != 0).count();
}
}
