/*
 * @lc app=leetcode id=747 lang=java
 *
 * [747] Largest Number At Least Twice of Others
 */

class Solution {
    public int dominantIndex(int[] nums) {
        return IntStream.range(0, nums.length) .boxed() .reduce((a, b) -> nums[a] > nums[b] ? a : b) .map(maxIdx -> Arrays.stream(nums).allMatch(n -> n == nums[maxIdx] || nums[maxIdx] >= 2 * n) ? maxIdx : -1) .orElse(-1);
    }
}
