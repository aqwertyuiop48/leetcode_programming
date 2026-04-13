/*
 * @lc app=leetcode id=1470 lang=java
 *
 * [1470] Shuffle the Array
 */

class Solution {
    public int[] shuffle(int[] nums, int n) {
        return IntStream.range(0, 2 * n)
            .map(i -> i % 2 == 0 ? nums[i / 2] : nums[n + i / 2])
            .toArray();
    }
}
