/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
// semicolons : 1
class Solution {
    public int searchInsert(int[] nums, int target) {
       return IntStream.concat(Arrays.stream(nums),IntStream.of(target)).boxed().sorted().collect(Collectors.toList()).indexOf(target);
    }
}
// @lc code=end

