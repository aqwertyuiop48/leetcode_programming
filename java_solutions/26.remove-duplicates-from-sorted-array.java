/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
// semicolons : 1
class Solution {
    public int removeDuplicates(int[] nums) {
        return nums.length == 0 ? 0 : Optional.of(new int[]{1}).map(j -> IntStream.range(1, nums.length).filter(i -> nums[i - 1] != nums[i]).peek(i -> nums[j[0]++] = nums[i]).mapToObj(i -> j[0]).reduce((a, b) -> b).orElse(j[0])).orElse(1);
    }
}
// @lc code=end

