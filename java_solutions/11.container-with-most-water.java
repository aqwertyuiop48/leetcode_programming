/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
// semicolons : 1
class Solution {
    public int maxArea(int[] height) {
        return Stream.concat(Stream.of(new int[]{0, height.length - 1}), Stream.iterate(new int[]{0, height.length - 1}, p -> p[0] < p[1], p -> height[p[0]] < height[p[1]] ? new int[]{p[0] + 1, p[1]} : new int[]{p[0], p[1] - 1})).mapToInt(p -> (p[1] - p[0]) * Math.min(height[p[0]], height[p[1]])).max().orElse(0);
    }
}
// @lc code=end

