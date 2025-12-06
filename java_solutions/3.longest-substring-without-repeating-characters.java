/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
// semicolons : 1
class Solution {
    public int lengthOfLongestSubstring(String s) {
        return s.isEmpty() ? 0 : Stream.of(IntStream.range(1, s.length()).boxed().reduce(new int[]{0, 0}, (acc, i) -> s.substring(acc[0], i).indexOf(s.charAt(i)) != -1 ? new int[]{acc[0] + s.substring(acc[0], i).indexOf(s.charAt(i)) + 1, Math.max(acc[1], i - acc[0])} : acc, (a, b) -> b)).map(arr -> Math.max(arr[1], s.length() - arr[0])).findFirst().orElse(0);
    }
}
// @lc code=end

