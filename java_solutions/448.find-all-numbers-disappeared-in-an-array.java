/*
 * @lc app=leetcode id=448 lang=java
 *
 * [448] Find All Numbers Disappeared in an Array
 */

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        return IntStream.of(IntStream.range(0, nums.length).map(i -> nums[Math.abs(nums[i]) - 1] = -Math.abs(nums[Math.abs(nums[i]) - 1])).sum()).boxed().flatMap(ignore -> IntStream.range(0, nums.length).filter(i -> nums[i] > 0).map(i -> i + 1).boxed()).collect(Collectors.toList());
    }
}
