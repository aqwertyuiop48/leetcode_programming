/*
 * @lc app=leetcode id=34 lang=java
 *
 * [34] Find First and Last Position of Element in Sorted Array
 */

// @lc code=start
// semicolons : 1
class Solution {
    public int[] searchRange(int[] nums, int target) {
        return Optional.of(Arrays.stream(nums).boxed().collect(Collectors.toList())).map(list -> new int[]{list.indexOf(target), list.lastIndexOf(target)}).orElse(new int[]{-1, -1});
    }
}
// @lc code=end

