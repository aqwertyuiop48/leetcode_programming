/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
// Semicolons : 1
class Solution {
    public int[] twoSum(int[] nums, int target) {
        return IntStream.range(0, nums.length).boxed().flatMap(i -> IntStream.range(0, i).filter(j -> nums[i] + nums[j] == target).mapToObj(j -> new int[]{i, j})).findFirst().orElse(new int[]{});
    }
}
// @lc code=end

