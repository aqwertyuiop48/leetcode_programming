/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
// semicolons : 1
class Solution { 
    public int removeElement(int[] nums, int val) { 
        return Optional.of(new int[]{0}).map(j -> IntStream.range(0, nums.length).filter(i -> nums[i] != val).peek(i -> nums[j[0]++] = nums[i]).mapToObj(i -> j[0]).reduce((a, b) -> b).orElse(j[0])).orElse(0);
    }
}
// @lc code=end

