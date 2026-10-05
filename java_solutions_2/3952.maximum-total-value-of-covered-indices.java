/*
 * @lc app=leetcode id=3952 lang=java
 *
 * [3952] Maximum Total Value of Covered Indices
 */

class Solution {
public long maxTotal(int[] nums, String s) {
    return IntStream.range(0, nums.length).map(i -> nums.length - 1 - i).collect(() -> new long[]{0, Integer.MAX_VALUE}, (st, i) -> st[0] += s.charAt(i) == '1' ? nums[i] + 0 * (st[1] = Math.min(st[1], nums[i])) : (i + 1 < nums.length && s.charAt(i + 1) == '1' ? nums[i] - Math.min(st[1], nums[i]) : 0) + 0 * (st[1] = Integer.MAX_VALUE), (a, b) -> {})[0];
}
}
