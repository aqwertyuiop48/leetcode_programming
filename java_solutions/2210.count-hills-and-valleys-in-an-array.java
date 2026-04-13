/*
 * @lc app=leetcode id=2210 lang=java
 *
 * [2210] Count Hills and Valleys in an Array
 */

class Solution {
    public int countHillValley(int[] nums) {
        return Optional.of(IntStream.range(0, nums.length)
                .filter(i -> i == 0 || nums[i] != nums[i - 1])
                .map(i -> nums[i]).toArray())
            .map(a -> (int) IntStream.range(1, a.length - 1)
                .filter(i -> (a[i] > a[i - 1] && a[i] > a[i + 1]) || (a[i] < a[i - 1] && a[i] < a[i + 1]))
                .count())
            .get();
    }
}
