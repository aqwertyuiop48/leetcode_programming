/*
 * @lc app=leetcode id=3940 lang=java
 *
 * [3940] Limit Occurrences in Sorted Array
 */

class Solution {
public int[] limitOccurrences(int[] nums, int k) {
    return Arrays.copyOf(nums, IntStream.of(nums).collect(() -> new int[]{0}, (st, n) -> st[0] += st[0] < k || n != nums[st[0] - k] ? 1 + 0 * (nums[st[0]] = n) : 0, (a, b) -> {})[0]);
}
}
