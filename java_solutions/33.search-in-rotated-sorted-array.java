/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 */

// @lc code=start
// semicolons : 1
class Solution {
    public int search(int[] nums, int target) {
        return Arrays.stream(nums).boxed().collect(Collectors.toList()).indexOf(target);
    }
}
// @lc code=end

