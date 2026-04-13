/*
 * @lc app=leetcode id=442 lang=java
 *
 * [442] Find All Duplicates in an Array
 */

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        return IntStream.range(0, nums.length).map(i -> Math.abs(nums[i])).filter(x -> (nums[x - 1] = -nums[x - 1]) > 0).mapToObj(Math::abs).collect(Collectors.toList());
    }
}
